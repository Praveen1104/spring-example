package com.example.loosecouple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer {

    public void test() {
        System.out.println("Pen is writing");
    }
}
