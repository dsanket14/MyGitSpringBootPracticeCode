package com.cds.service;

import com.cds.model.Student;
import com.cds.repo.StrudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StrudentRepo strudentRepo;

    public Student saveStudent(Student student) {
        return strudentRepo.save(student);
    }

    public List<Student> getStudents() {
        return strudentRepo.getAllStudents();
    }

    public Student getDatabyId(Integer studId) {
        return strudentRepo.findByStudId(studId);
    }

    public List<Student> getDataByName(String studName){
        return  strudentRepo.findbyStudName(studName);
    }

    public Student updateStudent(Student student) {
        return strudentRepo.update(student);
    }

    public String deleteStudent(Integer studId) {
       strudentRepo.delete(studId);
        return "Student removed for having Student Id =  " + studId;
    }
}
