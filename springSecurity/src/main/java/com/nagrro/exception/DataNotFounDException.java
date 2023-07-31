package com.nagrro.exception;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

@ResponseStatus(HttpStatus.NOT_FOUND)
@AllArgsConstructor
public class DataNotFounDException extends RuntimeException{
    private String message;
}
