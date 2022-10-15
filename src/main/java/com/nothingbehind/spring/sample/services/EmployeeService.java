package com.nothingbehind.spring.sample.services;

import java.util.List;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.resouces.EmployeeResource;

public interface EmployeeService {
	public EmployeeResource getEmployees();

	public void createEmployee(String name);
}
