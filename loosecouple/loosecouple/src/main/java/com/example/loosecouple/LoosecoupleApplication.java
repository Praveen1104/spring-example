package com.example.loosecouple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LoosecoupleApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(LoosecoupleApplication.class, args);

        Student student = context.getBean(Student.class);
        student.Exam();
    }

}
