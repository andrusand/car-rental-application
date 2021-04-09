package ee.sda.carrental.controller;

import ee.sda.carrental.entity.Company;
import ee.sda.carrental.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService service;


}
