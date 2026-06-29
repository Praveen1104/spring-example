package com.example.demo;

public class Student {

    private int age;
    private int rno;

    private Writer writer; 

    public void setWriter(Writer writer) { 
        this.writer = writer;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getAge() {
        return age; 
    }

    public void setAge(int age) {

        if (age < 0) {
            System.out.println("Age should not below 0");
            this.age = 0;
        }
        this.age = age;
    }

    public Student() {
        System.out.println("Student constructor");
    }

    public void Show() {
        System.out.println("in show method");
    }

    public void writeExam() {
        writer.write();
    }
}
