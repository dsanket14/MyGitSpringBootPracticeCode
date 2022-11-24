package com.cts.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import jdk.jfr.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue
    private int studentId;

  //  @NotNull
  //  @Pattern(regexp="[A-Za-z]*", message="Last name should not contain space and special characters")
   // @Size(min = 2, message = "Student First Name at least 2 character")
    private String studentFirstName;

 //   @Pattern(regexp="[A-Za-z]*", message="Last name should not contain space and special characters")
    private String studentLastName;

    private String studentClass;

    private String studentAddress;

    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    @Timestamp
    private Date studentDOB;

    private int studentAge;

    private String studentDream;

    private long studentMb;

 //   @Email(message = "Email is not valid", regexp = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])")
  //  @NotEmpty(message = "Email cannot be empty")
    private String studentEmailId;

   // @Size(min = 8, message = "Password Must be 8 charter")
  //  @NotNull
    private String studentPassword;

}
