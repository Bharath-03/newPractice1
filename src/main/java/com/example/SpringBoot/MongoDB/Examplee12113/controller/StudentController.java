package com.example.SpringBoot.MongoDB.Examplee12113.controller;


import com.example.SpringBoot.MongoDB.Examplee12113.model.Student;
import com.example.SpringBoot.MongoDB.Examplee12113.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;




    @GetMapping("/student")
    public ResponseEntity<?> getStudent(){
       List<Student> student = studentRepository.findAll();
       if(student.size() >0){
           return new ResponseEntity<List<Student>>(student, HttpStatus.OK);
       }else{
           return new ResponseEntity<>("No students available",HttpStatus.NOT_FOUND);
       }
    }

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        try {
           studentRepository.save(student);
            return new ResponseEntity<Student>(student,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<?> getById (@PathVariable String id){
       Optional<Student> studentOptional =studentRepository.findById(id);
       if(studentOptional.isPresent()){
           return new ResponseEntity<>(studentOptional.get(),HttpStatus.OK);
       }else {
           return new ResponseEntity<>("no student with id",HttpStatus.NOT_FOUND);
       }

        }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<?> deleteById (@PathVariable String id){
        try{
            studentRepository.deleteById(id);
            return new ResponseEntity<>("successfully deleted "+id,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }

    }




}

