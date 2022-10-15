package com.nothingbehind.spring.sample.exceptions.not_found;

public class EmployeeNotFoundException extends NotFoundExceptionBase {
	
	static final String CODE = "1000";
	
	public EmployeeNotFoundException(Integer id) {
		super("Employee ID " + id + " is invalid", CODE);
	}
}
