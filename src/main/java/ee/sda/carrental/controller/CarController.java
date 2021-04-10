package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Reservation;
import ee.sda.carrental.service.CarService;
import ee.sda.carrental.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService service;

    @Autowired
    ReservationService reservationService;



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
    public String updateCarGet(@PathVariable("id") int id, Model model) {
        Car car = service.read(id);
        model.addAttribute("car", car);
        return "/updateCar";

    }

    @PostMapping("/{id}/edit")
    public String updateCarPost(@PathVariable("id") int id, @Validated Car car,
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


    @GetMapping("/{id}/book")
    public String readReservation(@PathVariable("id") int id, Model model) {
        Car car = service.read(id);
        model.addAttribute("car", car);
        return "reservationCar";

    }

    @PostMapping("/{id}/book")
    public String createOrUpdateBooking(@PathVariable("id") int id, @Validated Car car,
                             BindingResult result, Model model) {
        Reservation reservation = new Reservation();
        reservationService.createOrUpdate(reservation);
        model.addAttribute("reservation", reservation);
                return "reservationCar";
    }
}
