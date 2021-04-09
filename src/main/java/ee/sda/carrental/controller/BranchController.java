package ee.sda.carrental.controller;

import ee.sda.carrental.service.BranchService;
import ee.sda.carrental.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    BranchService service;

}
