package com.example.demojar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String HelloWorld (Model model){
        model.addAttribute("message", "Hello from Thymeleaf!");

        return "index";
    }

}
