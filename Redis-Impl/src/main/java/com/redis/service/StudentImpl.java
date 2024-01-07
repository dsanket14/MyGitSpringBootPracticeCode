package com.redis.service;

import com.redis.entity.Student;
import com.redis.exception.NotFound;
import com.redis.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.io.Serializable;

@Service
public class StudentImpl{

    @Autowired
    private StudentRepo repo;

    public Student saveStudent(Student student){
        repo.save(student);
        return student;
    }
    @Cacheable(value="student", key="#name")
    public Student getStudentByName(String name){
        repo.findByName(name);
        Student student=repo.findByName(name);
        if(student==null) throw new NotFound(name+"Not Found");
        return student;
    }

    @PutMapping("/update/{name}")
    public Student updateStudent(Student student,String name){
        Student student1=repo.findByName(name);
        if(student1==null) throw new NotFound(name+"Not Found");
        student1.setAge(student.getAge());
        student1.setName(student.getName());
        student1.setCity(student.getCity());
        student1.setMbNo(student.getMbNo());
        return student;
    }
    @CacheEvict(value="delete", key="#name")
    public String deleteStudent(String name){
        repo.deleteByName(name);
        return name+ " deleted Successfully";
    }

}
