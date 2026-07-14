package com.example.firstrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.firstrestapi.service.HelloService;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String greet() {
        return helloService.getTodayGreeting();
    }

    @GetMapping("about")
    public String about() {
        return "Victory";
    }
}
