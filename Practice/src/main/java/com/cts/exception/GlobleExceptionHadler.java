package com.cts.exception;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExceptionHadler {

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> nodatafordelete(EmptyResultDataAccessException emptyResultDataAccessException){
        return new ResponseEntity<String>("Data not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<String> inputnotreadable(HttpMessageNotReadableException httpMessageNotReadableException){
        return new ResponseEntity<String>("I/p parameteers not in correct formate",HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<String> methodnotallowes(HttpRequestMethodNotSupportedException httpRequestMethodNotSupportedException){
        return new ResponseEntity<String>("Wrong Restfull method chosen",HttpStatus.METHOD_NOT_ALLOWED);
    }
    @ExceptionHandler(RecordNotFound.class)
    public ResponseEntity<String> recordntfound(RecordNotFound recordNotFound){
        return new ResponseEntity<String>("Record not found for corresponding Id",HttpStatus.NOT_FOUND);
    }

}
