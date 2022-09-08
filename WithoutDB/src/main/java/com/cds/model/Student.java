package com.cds.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private  int studId;
    private String studName;
    private String studClass;
    private String studDiv;
    private String studCity;
    private long studMb;
}
