package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {

    @Autowired
    private Department department;

    private Subjects subjects;

    private Marks marks;

    @Autowired
    Teacher(Subjects subjects) {
        System.out.println("Autowired is calling");
        this.subjects = subjects;
    }

    @Autowired
    public void setMarks(Marks marks) {
        System.out.println("Setter Injection is calling");
        this.marks = marks;
    }

    public void TakeClass() {
        department.TakingClass();
    }

    public void showSubjects() {
        subjects.showSubjects();
    }

    public void showMarks() {
        marks.showMarks();
    }
}
