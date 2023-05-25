package com.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StudentAdvice extends ResponseEntityExceptionHandler{

	@ExceptionHandler(Alreadyexist.class)
	public ResponseEntity<Object> handleAlreadyExistexception(Alreadyexist exception){
		ExceptionResponce exceptionResponce = new ExceptionResponce();
		
		exceptionResponce.setCode(HttpStatus.ALREADY_REPORTED.value());
		exceptionResponce.setMsg(exception.getMessage());
		exceptionResponce.setLocalDateTime(LocalDateTime.now());
		
		return new ResponseEntity(exceptionResponce, HttpStatus.ALREADY_REPORTED);
	}
}
