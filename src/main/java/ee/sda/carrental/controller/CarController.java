package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.repository.CarRepository;
import ee.sda.carrental.service.CarService;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
