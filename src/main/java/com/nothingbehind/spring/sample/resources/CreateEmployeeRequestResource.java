package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeRequestResource implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull(message = "name is null")
	@Size(min = 1, max = 128, message = "name length must be between 1 and 128")
	private String name;
	
	@NotNull(message = "id is null")
	private Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
