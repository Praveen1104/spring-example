package com.example.jpacrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.jpacrud.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    List<Student> findByTech(String technology);

    @Query(nativeQuery = true,
            value = "SELECt * from student where gender=:gender  AND tech=:tech"
    )
    List<Student> findByGenderAndTech(@Param("gender") String gender, @Param("tech") String tech);
}
