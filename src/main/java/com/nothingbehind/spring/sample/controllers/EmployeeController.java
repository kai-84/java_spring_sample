package com.nothingbehind.spring.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nothingbehind.spring.sample.resouces.EmployeeListResource;
import com.nothingbehind.spring.sample.services.EmployeeListService;



@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	EmployeeListService employeeListService;
	
	@RequestMapping(method = RequestMethod.GET)
	public EmployeeListResource list() {
		EmployeeListResource resource = employeeListService.getEmployees();
		return resource;
	}
}
