package com.example.demojar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @RequestMapping("/hello")
    public String SayHello (){
        return "Hello Spring Boot Controller!";
    }

}
