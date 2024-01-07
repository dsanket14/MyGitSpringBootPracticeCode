package com.redis.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document("redis_testing")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student   implements Serializable {

    private ObjectId id;
    private String name;
    private int age;
    private long mbNo;
    private String city;

}
