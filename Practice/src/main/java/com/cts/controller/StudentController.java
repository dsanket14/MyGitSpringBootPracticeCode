package com.cts.controller;

import com.cts.exception.RecordNotFound;
import com.cts.model.Student;
import com.cts.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    StudentService studentServiceImpl;

    @PostMapping("/save")
    public ResponseEntity<Student> saveData(@Valid @RequestBody Student student){
        Student student2= studentServiceImpl.saveData(student);

        return new ResponseEntity<>(student2,HttpStatus.CREATED);
    }

    @PostMapping("/saveall")
    public ResponseEntity<List<Student>> saveBulOfData(@Valid @RequestBody List<Student> students){
       List<Student> studentList= studentServiceImpl.saveBulOfData(students);

       return new ResponseEntity<>(studentList,HttpStatus.CREATED);
    }

    @PostMapping("/signin")
    public ResponseEntity<Student> signIn(@RequestBody Student student){
        Student student1=studentServiceImpl.signIn(student);
        return new ResponseEntity<>(student1,HttpStatus.CREATED);
    }
    @GetMapping("/signup/{studentEmailId}/{studentPassword}")
    public String signUp(@PathVariable String studentEmailId, @PathVariable String studentPassword){
        boolean signUpStatus=studentServiceImpl.signUp(studentEmailId,studentPassword);
         if(signUpStatus==true){
             return "Sign Up Successfully";
         }
         return "Your EmailId & Password Not matches with our DataBase";
    }
    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> studentList= studentServiceImpl.getAll();
        if(studentList.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(studentList));
    }

    @GetMapping("/getdatabyid/{studentId}")
    public ResponseEntity<Object> getDataById(@PathVariable int studentId){
        Optional<Student> student=studentServiceImpl.getDataById(studentId);

        if(student==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(student));
    }

    @PutMapping("/update/{studentId}")
    public ResponseEntity<Student> updateData(@RequestBody Student student, @PathVariable int studentId) throws RecordNotFound {

        Student student1 =studentServiceImpl.getDataById(studentId).orElseThrow(()-> new RecordNotFound("Data Not found for-"+studentId));

            student1.setStudentFirstName(student.getStudentFirstName());
            student1.setStudentLastName(student.getStudentLastName());
            student1.setStudentAddress(student.getStudentAddress());
            student1.setStudentMb(student.getStudentMb());
            student1.setStudentAge(student.getStudentAge());
            student1.setStudentDOB(student.getStudentDOB());
            student1.setStudentClass(student.getStudentClass());
            student1.setStudentDream(student.getStudentDream());
            student1.setStudentEmailId(student.getStudentEmailId());
            student1.setStudentPassword(student.getStudentPassword());

        Student students= studentServiceImpl.updateData(student1);
        return new ResponseEntity<>(students,HttpStatus.CREATED);
    }

    @DeleteMapping("/deletebyid/{studentId}")
    public String deleteById(@PathVariable int studentId){
       studentServiceImpl.deleteById(studentId);
       return "Data deleted Successfully for ID="+studentId;
    }

    @DeleteMapping("/deleteall")
    public String deleteAll(){
        studentServiceImpl.deleteAll();
        return "Data deleted Successfully";
    }
}
