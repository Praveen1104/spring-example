package com.example.hello;

import org.springframework.stereotype.Component;

@Component
public class Department {

    Department() {
        System.out.println("Department is created");
    }

    public void TakingClass() {
        System.out.println("Teacher is taking class");
    }
}
