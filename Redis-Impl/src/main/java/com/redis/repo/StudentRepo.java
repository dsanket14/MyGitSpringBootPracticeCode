package com.redis.repo;

import com.redis.entity.Student;
import org.bson.types.ObjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, ObjectId> {

    Student findByName(String name);

    void deleteByName(String name);
}
