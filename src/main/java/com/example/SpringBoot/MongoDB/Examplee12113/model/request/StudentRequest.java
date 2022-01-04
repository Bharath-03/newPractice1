package com.example.SpringBoot.MongoDB.Examplee12113.model.request;


import io.swagger.annotations.ApiModel;
import lombok.*;
import org.springframework.data.annotation.Id;

@ApiModel(description = "Request model for User")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)

public class StudentRequest {


    @Id
    private  String id;

    private String name;

    private String college;

    private String email;



}
