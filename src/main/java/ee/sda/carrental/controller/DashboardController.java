package ee.sda.carrental.controller;


import ee.sda.carrental.entity.Car;
import ee.sda.carrental.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {


    @Autowired
    CarService service;


    @GetMapping("")
    String dashboard(){
        return "dashboard";
    }

    @GetMapping("/addcar")
    String createCarGet(Model model){
        model.addAttribute("car", new Car());
        return "addCar";
    }

    @PostMapping("/addcar")
    RedirectView createCarPost(Car car) {
        service.createOrUpdate(car);
        return new RedirectView("/car/all");
    }

}
