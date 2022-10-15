package com.nothingbehind.spring.sample.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.exceptions.not_found.EmployeeNotFoundException;
import com.nothingbehind.spring.sample.repositories.EmployeeRepository;
import com.nothingbehind.spring.sample.resources.ShowEmployeeResponseResource;

@Service
public class ShowEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public ShowEmployeeResponseResource show(Integer employeeId) {
		Optional<Employee> employee = employeeRepository.findById(employeeId);

		if (!employee.isPresent()) {
			throw new EmployeeNotFoundException(employeeId);
		}

		ShowEmployeeResponseResource resource = new ShowEmployeeResponseResource();
		resource.setId(employeeId);
		resource.setName(employee.get().getName());
		return resource;
	}
}
