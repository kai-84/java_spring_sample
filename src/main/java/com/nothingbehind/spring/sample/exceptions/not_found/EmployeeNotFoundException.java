package com.nothingbehind.spring.sample.exceptions.not_found;

public class EmployeeNotFoundException extends NotFoundExceptionBase {
	public EmployeeNotFoundException(Integer id) {
		super("Employee ID " + id + " is invalid");
	}
}
