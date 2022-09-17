package com.cts.service;

import com.cts.dao.StudentDao;
import com.cts.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentDao studentDaoImpl;

    public Student saveData(Student student){
        return studentDaoImpl.saveData(student);
    }

    public List<Student> saveBulOfData(List<Student> students){
        return studentDaoImpl.saveBulOfData(students);
    }

    public Student signIn(Student student){
        return studentDaoImpl.signIn(student);
    }

    public boolean signUp(String studentEmailId, String studentPassword){
       return studentDaoImpl.signUp(studentEmailId,studentPassword);
    }
    public List<Student> getAll(){
        return studentDaoImpl.getAll();
    }

    public Optional<Student> getDataById(int studentId){
        return studentDaoImpl.getDataById(studentId);
    }

    public Student updateData(Student student){
        return studentDaoImpl.updateData(student);
    }

    public void deleteById(int studentId){
        studentDaoImpl.deletebyId(studentId);
    }

    public void deleteAll(){
        studentDaoImpl.deleteAll();
    }
}
