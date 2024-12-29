package com.rajneesh304.todoapi.controller.advice;

import com.rajneesh304.todoapi.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;

import java.util.Map;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {NotFoundException.class, ResourceNotFoundException.class})
    public ResponseEntity<Object> handle404(RuntimeException ex, WebRequest request) {
        System.out.println("In handle 404");
        return responseFromError(ex, HttpStatus.NOT_FOUND );
    }

    private ResponseEntity<Object> responseFromError(RuntimeException ex, HttpStatus status) {
        String message = ex.getMessage();
        return new ResponseEntity<>(Map.<String, String>of("error", message), status);
    }

}
