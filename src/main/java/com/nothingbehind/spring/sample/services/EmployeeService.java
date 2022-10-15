package com.nothingbehind.spring.sample.services;

import java.util.List;

import com.nothingbehind.spring.sample.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();

	public void createEmployee(String name);
}
