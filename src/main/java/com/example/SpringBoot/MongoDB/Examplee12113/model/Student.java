package com.example.SpringBoot.MongoDB.Examplee12113.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")


public class Student {


    @Id
    private String id;

    private String name;

    private String college;

    private String email;


}
