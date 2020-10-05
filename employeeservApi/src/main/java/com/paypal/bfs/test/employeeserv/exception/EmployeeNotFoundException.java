package com.paypal.bfs.test.employeeserv.exception;

public class EmployeeNotFoundException extends RuntimeException {

	String message;

	public EmployeeNotFoundException(String message) {
		super(message);
		this.message = message;
	}
}
