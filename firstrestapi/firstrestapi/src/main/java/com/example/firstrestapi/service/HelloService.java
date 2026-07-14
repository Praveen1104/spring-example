package com.example.firstrestapi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService bean created");
    }

    public String getTodayGreeting() {
        return "Hello Java";
    }
}
