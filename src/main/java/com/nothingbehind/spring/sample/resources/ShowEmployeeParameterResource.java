package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;

import org.springframework.stereotype.Service;

@Service
public class ShowEmployeeParameterResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer employeeId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}
