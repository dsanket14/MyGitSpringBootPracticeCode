package com.nagrro.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class AllExceptionHandler {

    @ExceptionHandler(DataNotFounDException.class)
    public ResponseEntity<Map<String,String>> recordNotFound(DataNotFounDException recordNotFound){
        Map<String,String> hashMap= new HashMap<>();
        hashMap.put("Status","FAILED");
        hashMap.put("StatusCode","400");
        hashMap.put("message",recordNotFound.getMessage());
        return new ResponseEntity<Map<String,String>>(hashMap, HttpStatus.NOT_FOUND);
    }
}
