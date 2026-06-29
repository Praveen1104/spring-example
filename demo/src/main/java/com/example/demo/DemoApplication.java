package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        ApplicationContext context
                = new ClassPathXmlApplicationContext("springconfig.xml");

        Student student = (Student) context.getBean("std1");
        student.setAge(20);
        //System.out.println(student.getAge());
        //student.Show();
        student.writeExam();
    }
}
