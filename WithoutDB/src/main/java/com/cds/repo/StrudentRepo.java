package com.cds.repo;

import com.cds.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StrudentRepo {
    private List<Student> list = new ArrayList<Student>();

    //Available data only for understanding
    public void createStudents() {
        list = List.of(
                new Student(1,"Sanket","BE","A","Pune",7798892075l),
                new Student(2,"Saylee","TE","A","Pune",7020819760l)
        );

    }
    //save data
    public Student save(Student student) {
        Student s=new Student();
        s.setStudId(student.getStudId());
        s.setStudName(student.getStudName());
        s.setStudCity(student.getStudCity());
        s.setStudClass(student.getStudClass());
        s.setStudDiv(student.getStudDiv());
        s.setStudMb(student.getStudMb());
        list.add(s);
        return s;
    }

    //get all data
    public List<Student> getAllStudents() {
        return list;
    }

    //get data by student id
    public Student findByStudId(Integer studId){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudId() == (studId)) {
                return list.get(i);
            }
        }
        return null;
    }
    // get data by student name
    public List<Student> findbyStudName(String studName) {
        return list.stream().filter(i->i.getStudName().equals(studName)).collect(Collectors.toList());
    }


    //update data
    public Student update(Student student) {
        int studIdx = 0;
        int studId = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getStudId() == (student.getStudId())) {
                studId=student.getStudId();
                studIdx = i;
                break;
            }
        }

        Student student1=new Student();
       student1.setStudId(studId);
       student1.setStudName(student.getStudName());
       student1.setStudCity(student.getStudCity());
       student1.setStudClass(student.getStudClass());
       student1.setStudDiv(student.getStudDiv());
       student1.setStudMb(student.getStudMb());

        list.set(studIdx, student);
        return student1;
    }

    // delete data by student id
    public String delete(Integer studId) {
        list.removeIf(x -> x.getStudId() == (studId));
        return null;
    }

}
