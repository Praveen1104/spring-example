package com.example.loosecouple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pencil implements Writer {

    public void test() {
        System.out.println("Pencil is writing");
    }
}
