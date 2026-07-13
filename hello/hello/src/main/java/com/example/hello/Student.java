package com.example.hello;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

    int age;

    public void show() {
        System.out.println("Hello World");
    }
}
