package com.cts.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Books {

    @Id
    @GeneratedValue
    private int bookId;

    private String bookName;

    private String bookAuthour;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date bookLaunchDate;

    private int bookLength;

    private double bookPrice;
}

