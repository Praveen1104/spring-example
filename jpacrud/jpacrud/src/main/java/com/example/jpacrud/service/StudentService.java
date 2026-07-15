package com.example.jpacrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jpacrud.model.Student;
import com.example.jpacrud.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public Student getStudentById(int rlno) {
        return studentRepo.findById(rlno).orElse(null);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(int rlno) {
        studentRepo.deleteById(rlno);
        return;
    }

    public void deletAll() {
        studentRepo.deleteAll();
    }

    public List<Student> getStudentsByTechId(String technology) {
        return studentRepo.findByTech(technology);
    }

    public List<Student> getStudentsByGenderAndTech(String gender, String technoloy) {
        return studentRepo.findByGenderAndTech(gender, technoloy);
    }
}
