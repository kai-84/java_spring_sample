package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.stereotype.Service;

import com.nothingbehind.spring.sample.exceptions.bad_request.BadRequestExceptionBase;

@Service
public class ShowEmployeeParameterResource implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Positive
	@Valid
	private Integer employeeId;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
}
