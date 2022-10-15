package com.nothingbehind.spring.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.repositories.EmployeeRepository;
import com.nothingbehind.spring.sample.resources.CreateEmployeeRequestResource;

@Service
public class CreateEmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public void create(CreateEmployeeRequestResource resource) {
		Employee employee = new Employee();
		employee.setName(resource.getName());
		employeeRepository.save(employee);
	}
}
