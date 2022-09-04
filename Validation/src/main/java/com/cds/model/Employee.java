package com.cds.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    @NotNull
    @Size(min = 2, message = "Employee First Name at least 2 character")
    private String empName;

    private String empAddress;

    private long empMb;

    private double empSalary;

    @Email(message = "Email must be valid")
    private String empEmailId;

    @NotNull
    @Size(min = 4, message = "Password at least 4 character")
    private String empPassword;
}
