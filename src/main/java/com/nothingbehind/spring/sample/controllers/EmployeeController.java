package com.nothingbehind.spring.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nothingbehind.spring.sample.resources.CreateEmployeeRequestResource;
import com.nothingbehind.spring.sample.resources.EmployeeListResource;
import com.nothingbehind.spring.sample.resources.ShowEmployeeResponseResource;
import com.nothingbehind.spring.sample.services.CreateEmployeeService;
import com.nothingbehind.spring.sample.services.EmployeeListService;
import com.nothingbehind.spring.sample.services.ShowEmployeeService;



@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	EmployeeListService employeeListService;
	
	@Autowired
	CreateEmployeeService createEmployeeService;
	
	@Autowired
	ShowEmployeeService showEmployeeService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public EmployeeListResource list() {
		EmployeeListResource resource = employeeListService.getEmployees();
		return resource;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public void create(@Validated @RequestBody CreateEmployeeRequestResource newResource) {
		createEmployeeService.create(newResource);
	}
	
	@RequestMapping(path = "/{employeeId}", method = RequestMethod.GET)
	public ShowEmployeeResponseResource show(@PathVariable("employeeId") Integer employeeId) {
		ShowEmployeeResponseResource resource = showEmployeeService.show(employeeId);
		return resource;
	}
}
