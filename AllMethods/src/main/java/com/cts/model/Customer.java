package com.cts.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    private int custId;

    private String custName;

    private String custAddress;

    @JsonFormat(pattern = "dd-MM-yyyy", timezone = "Asia/Kolkata")
    private Date custDOB;

    private long custContactNumber;

    private String custEmailId;




}
