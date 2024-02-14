package com.example.microservice2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class ApiController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello from micro2";
    }
}
