package com.example.jpacrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpacrud.model.Student;
import com.example.jpacrud.service.StudentService;

@RestController

public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student> getStudents() {
        return studentService.getStudents();

    }

    @GetMapping("students/{rlno}")
    public ResponseEntity<Student> getStudentById(@PathVariable("rlno") int rlno) {

        Student student = studentService.getStudentById(rlno);
        if (student == null) {
            return new ResponseEntity<>(student, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @PostMapping("students")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        studentService.addStudent(student);

        return new ResponseEntity<String>("New Data Added", HttpStatus.CREATED);
    }

    @PutMapping("students")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Student Updated";

    }

    @DeleteMapping("students/{rlno}")
    public String deleteStudent(@PathVariable("rlno") int rlno) {
        studentService.deleteStudent(rlno);
        return "Student Deleted";
    }

    @DeleteMapping("/students/clear")
    public String delteAll() {
        studentService.deletAll();
        return "All the student has been deleted";
    }

    @GetMapping("/students/technology/{tech}")
    public List<Student> getStudentsByTech(@PathVariable("tech") String technology) {
        return studentService.getStudentsByTechId(technology);
    }

    @PostMapping("/students/filter")
    public List<Student> getStudentsByGenderAndTech(@Param("gender") String gender, @Param("tech") String tech) {
        return studentService.getStudentsByGenderAndTech(gender, tech);
    }
}
