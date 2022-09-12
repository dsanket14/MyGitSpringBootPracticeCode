package com.cts.dao;


import com.cts.model.Student;
import com.cts.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentDao {

    @Autowired
    StudentRepo studentRepoImpl;

    public Student saveData(Student student){
        return studentRepoImpl.save(student);
    }

    public List<Student> saveBulOfData(List<Student> students){
        return studentRepoImpl.saveAll(students);
    }
    public List<Student> getAll(){
        return studentRepoImpl.findAll();
    }

    public Optional<Student> getDataById(int studentId){
        return studentRepoImpl.findById(studentId);
    }

    public Student updateData(Student student){
        return studentRepoImpl.save(student);
    }

    public void deletebyId(int studentId){
        studentRepoImpl.deleteById(studentId);
    }
    public void deleteAll(){
        studentRepoImpl.deleteAll();
    }
}
