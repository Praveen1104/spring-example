package com.example.demo;

public class Pen implements Writer {

    public Pen() {
        System.out.println("Pen is created");
    }

    public void write() {
        System.out.println("Writing using pen");
    }
}
