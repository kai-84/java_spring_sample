package com.nothingbehind.spring.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
}
