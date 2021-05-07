package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails(Model model) {
//        Employee employee = new Employee();
//        employee.setName("II");
//        employee.setSurname("SS");
//        employee.setSalary(22);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }


    @GetMapping(path = "/showDetails")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee,
                              BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }

        return "show-emp-details-view";
    }

}
