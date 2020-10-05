package com.paypal.bfs.test.employeeserv.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.paypal.bfs.test.employeeserv.api.model.Message;
import com.paypal.bfs.test.employeeserv.exception.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Message> resourceNotFound(EmployeeNotFoundException ex) {
		Message response = new Message();
		response.setType("ERROR");
		response.setMessage(ex.getMessage());
		return new ResponseEntity<Message>(response, HttpStatus.NOT_FOUND);
	}
}
