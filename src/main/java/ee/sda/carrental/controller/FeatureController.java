package ee.sda.carrental.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeatureController {


    @GetMapping("/info")
    String feature() {return "info";}

}
