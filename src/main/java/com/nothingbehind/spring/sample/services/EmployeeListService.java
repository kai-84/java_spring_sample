package com.nothingbehind.spring.sample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.repositories.EmployeeRepository;
import com.nothingbehind.spring.sample.resouces.EmployeeListResource;

@Service
public class EmployeeListService {
	@Autowired
	EmployeeRepository employeeRepository;

	public EmployeeListResource getEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		EmployeeListResource resource = new EmployeeListResource();
		resource.setEmployees(employees);
		resource.setMainEmployeeName(employees.get(0).getName());

		return resource;
	}
}
