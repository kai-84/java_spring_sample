package com.nothingbehind.spring.sample.service_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.repositories.EmployeeRepository;
import com.nothingbehind.spring.sample.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public void createEmployee(String name) {
		Employee employee = new Employee();
		employee.setName(name);
		employeeRepository.save(employee);
	}
}
