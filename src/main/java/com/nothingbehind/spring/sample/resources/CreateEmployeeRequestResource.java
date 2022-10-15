package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeRequestResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotNull
	@Size(min = 1, max = 128)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
