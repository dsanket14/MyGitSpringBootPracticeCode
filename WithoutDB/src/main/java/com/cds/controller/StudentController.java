package com.cds.controller;

import com.cds.model.Student;
import com.cds.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/savedata")
    public Student savedata(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/getall")
    public List<Student> getalldata(){
        return studentService.getStudents();
    }

    @GetMapping("/getdatabyId/{studId}")
    public Student getdatabyId(@PathVariable Integer studId){
        return studentService.getDatabyId(studId);
    }

    @GetMapping("/getdatabyname/{studName}")
    public List<Student> getdatabyName(@PathVariable String studName){
        return studentService.getDataByName(studName);
    }

    @PutMapping("/update/{studId}")
    public Student updat(@RequestBody Student student, @PathVariable Integer studId){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deletebyId/{studId}")
    public String deletebyid(@PathVariable Integer studId){
        return studentService.deleteStudent(studId);
    }
}
