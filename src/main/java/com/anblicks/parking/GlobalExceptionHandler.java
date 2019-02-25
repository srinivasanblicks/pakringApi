package com.anblicks.parking;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<Object> handleException(Exception e){
		return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
