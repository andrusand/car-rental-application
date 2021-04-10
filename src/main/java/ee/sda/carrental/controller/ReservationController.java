package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Car;
import ee.sda.carrental.entity.Reservation;
import ee.sda.carrental.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
@RequestMapping("/reservation")
public class ReservationController {

    @Autowired
    ReservationService service;

    @GetMapping("/all")
    String listAllReservations(Model model){
        List<Reservation> reservationList = service.findAll();
        model.addAttribute("reservations", reservationList);
        return "reservationList";
    }

    }