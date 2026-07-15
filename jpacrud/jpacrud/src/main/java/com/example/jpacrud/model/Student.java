package com.example.jpacrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter  //we can just use @Data instead of @Getter and @Setter
public class Student {

    @Id
    private int rlno;
    private String name;
    private String gender;
    private String tech;
}
