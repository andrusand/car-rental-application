package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.repository.CarRepository;
import ee.sda.carrental.service.CarService;
import javassist.NotFoundException;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
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

    @GetMapping("/{id}/edit")
    public String updateCarVariable(@PathVariable("id") int id, Model model) {
        Car car = service.read(id);
        model.addAttribute("car", car);
        return "/updateCar";

    }

    @PostMapping("/{id}/edit")
    public String updateUser(@PathVariable("id") int id, @Validated Car car,
                             BindingResult result, Model model) {
        if (result.hasErrors()) {
            car.setCarID(id);
            return "/updateCar";
        }
        service.createOrUpdate(car);
        return "redirect:/car/all";
    }

    @GetMapping("/{id}/delete")
    public String deleteCar(@PathVariable("id") int id, Model model) {
        Car car = service.read(id);
        service.delete(car);
        return "redirect:/car/all";
    }


}
