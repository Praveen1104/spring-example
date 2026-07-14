package com.example.springbootcrud.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private int rnno;
    private String name;
    private String tech;
}
