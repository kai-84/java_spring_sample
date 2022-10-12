package com.nothingbehind.spring.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nothingbehind.spring.sample.entities.Employee;
import com.nothingbehind.spring.sample.services.EmployeeService;

@RestController
public class IndexController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/")
    public String index() {
        return "hello, world!";
    }
	
	@GetMapping("/employees")
	public List<Employee> employees() {
		return employeeService.getEmployees();
	}
	
	@RequestMapping(path = "/employees", method = RequestMethod.POST)
	public void createEmployee (@RequestParam(value = "name", defaultValue = "John") String name) {
		employeeService.createEmployee(name);
	}
	
	
}
