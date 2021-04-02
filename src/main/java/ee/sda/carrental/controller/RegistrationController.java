package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Customer;
import ee.sda.carrental.entity.Employee;
import ee.sda.carrental.service.CustomerService;
import ee.sda.carrental.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    CustomerService customerDetailsService;

    @Autowired
    EmployeeService employeeDetailsService;

    @GetMapping("/")
    String registration(){
        return "registration";
    }

    @GetMapping("customer")
    String createUser(Model model){
        model.addAttribute("customer", new Customer());
        return "registrationCustomer";
    }

    @PostMapping("/customer")
    RedirectView createCustomerPost(Customer customer){
        customerDetailsService.createCustomer(customer);
        return new RedirectView("/dashboard");
    }

    @GetMapping("employee")
    String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "registrationEmployee";
    }

    @PostMapping("/employee")
    RedirectView createEmployeePost(Employee employee){
        employeeDetailsService.createEmployee(employee);
        return new RedirectView("/dashboard");
    }






}
