package com.spring.rest.exception_handing;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<IncorrectDate> handleException(NoSuchEmployeeException exception){
        IncorrectDate date = new IncorrectDate();
        date.setInfo(exception.getMessage());
        return new  ResponseEntity<>(date, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<IncorrectDate> handleException(Exception exception){
        IncorrectDate date = new IncorrectDate();
        date.setInfo(exception.getMessage());
        return new  ResponseEntity<>(date, HttpStatus.BAD_REQUEST);
    }
}
