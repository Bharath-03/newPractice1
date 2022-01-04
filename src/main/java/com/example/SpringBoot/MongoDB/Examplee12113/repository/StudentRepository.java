package com.example.SpringBoot.MongoDB.Examplee12113.repository;

import com.example.SpringBoot.MongoDB.Examplee12113.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;



@Repository
public interface StudentRepository extends MongoRepository<Student,String> {


}
