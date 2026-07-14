package com.example.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.model.Student;
import com.example.springbootcrud.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents() {

        return studentService.getStudents();

    }

    @GetMapping("students/{rno}")
    public Student getStudentByRno(@PathVariable("rno") int rno) {
        return studentService.getStudentByRno(rno);
    }

    @PostMapping("students")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);

    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno) {
        return studentService.deleteStudent(rno);
    }

}
