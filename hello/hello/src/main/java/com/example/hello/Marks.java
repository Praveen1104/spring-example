package com.example.hello;

import org.springframework.stereotype.Component;

@Component
public class Marks {

    public void showMarks() {
        System.out.println("Maths: 90, Science: 85, English: 88");
    }
}
