package ee.sda.carrental.service;

import ee.sda.carrental.entity.Customer;
import ee.sda.carrental.entity.Employee;
import ee.sda.carrental.repository.CustomerRepository;
import ee.sda.carrental.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService implements UserDetailsService {

    @Autowired
    EmployeeRepository repository;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Employee employee = repository.findByEmployeeID(s);
        if (employee == null){
            throw new UsernameNotFoundException("Employee not found");
        }
        return employee;
    }

    public void createEmployee(Employee employee){
        repository.save(employee);

    }

}
