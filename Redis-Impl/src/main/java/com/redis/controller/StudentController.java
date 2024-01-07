package com.redis.controller;

import com.redis.entity.Student;
import com.redis.service.StudentImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/student")
@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentImpl service;

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @CachePut(value="update", key="#name")
    public Student update(@RequestBody Student student,@PathVariable String name){
        return service.updateStudent(student,name);
    }
    @GetMapping("/name")
    public Student getByName(@RequestParam String name){
        return service.getStudentByName(name);
    }
    @DeleteMapping("/delete/{name}")
    public String deleteByName(@PathVariable String name){
        return service.deleteStudent(name);
    }

}
