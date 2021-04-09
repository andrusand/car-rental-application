package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.repository.CarRepository;
import ee.sda.carrental.service.CarService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService service;


    @GetMapping("/all")
    String allCars(Model model){
        List<Car> carList = service.findAll();
        model.addAttribute("cars", carList);
        return "carList";
    }

    @GetMapping("/{carID}")
    public String singleCarPathVariable(@PathVariable("carID") int id, Model model) {
        Car singleCar = service.read(id);
        model.addAttribute("car", singleCar);
        return "singleCarDetails";

    }

    @GetMapping("/{carID}/edit")
    public String updateCarVariable(@PathVariable("carID") int id, Model model) {
        Car car = service.read(id);
        model.addAttribute("car", car);
        return "/updateCar";

    }
    @PostMapping("/{carID}/update")
    public String updateUser(@PathVariable("carID") int id, @Validated Car car,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            car.setCarID(id);
            return "/updateCar";
        }
        service.createOrUpdate(car);
        return "redirect:/index";
    }

    @GetMapping("/{carID}/delete")
    public String deleteCar(@PathVariable("carID") int id, Model model) {
        Car car = service.read(id);
        service.delete(car);
        return "redirect:/index";
    }


}
