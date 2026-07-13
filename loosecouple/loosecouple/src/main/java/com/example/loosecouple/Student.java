package com.example.loosecouple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    @Qualifier("pencil")
    private Writer writer;

    public void Exam() {
        writer.test();
    }

}
