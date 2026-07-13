package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(HelloApplication.class, args);

        Student stu = context.getBean(Student.class);
        stu.age = 30;

        stu.show();
        Student st1 = context.getBean(Student.class);
        st1.age = 40;
        System.err.println(st1.age);
        System.out.println(stu.age);

        //filed injection example
        Teacher teacher = context.getBean(Teacher.class);
        teacher.TakeClass();

        //constructor injection
        teacher.showSubjects();

        teacher.showMarks();
    }

}
