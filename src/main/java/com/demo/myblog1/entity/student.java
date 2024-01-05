package com.demo.myblog1.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity 
@Table(name = "new student")

public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String city;
    private String Email;
    private long mobile;

}
