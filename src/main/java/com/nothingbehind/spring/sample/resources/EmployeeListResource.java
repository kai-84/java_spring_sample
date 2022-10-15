package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import com.nothingbehind.spring.sample.entities.Employee;

public class EmployeeListResource implements Serializable {
	private static final long serialVersionID = 1L;
	private List<Employee> employees;
	private String mainEmployeeName = "";

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public static long getSerialversionid() {
		return serialVersionID;
	}

	public String getMainEmployeeName() {
		return this.mainEmployeeName.equalsIgnoreCase("") ? "No one" : mainEmployeeName;
	}

	public void setMainEmployeeName(String mainEmployeeName) {
		this.mainEmployeeName = mainEmployeeName;
	}
}
