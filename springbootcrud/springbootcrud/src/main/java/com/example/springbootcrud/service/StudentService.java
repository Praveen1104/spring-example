package com.example.springbootcrud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootcrud.model.Student;

@Service
public class StudentService {

    List<Student> students = new ArrayList<Student>(
            Arrays.asList(
                    new Student(1, "John", "Java"),
                    new Student(2, "Jane", "Python"),
                    new Student(3, "Mike", "JavaScript")
            )
    );

    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return students;
    }

    public Student getStudentByRno(int rno) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRnno() == rno) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            return students.get(index);
        } else {
            return null;
        }

    }

    public void addStudent(Student student) {
        students.add(student);

    }

    public String updateStudent(Student student) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRnno() == student.getRnno()) {
                index = i;
                found = true;
            }
        }
        if (found) {
            students.set(index, student);
            return "Student updated successfully";

        } else {
            return "Student not found";
        }
    }

    public String deleteStudent(int rno) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRnno() == rno) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            students.remove(index);
            return "Student deleted successfully";
        } else {
            return "Student not found";
        }
    }

}
