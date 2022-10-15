package com.nothingbehind.spring.sample.resources;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class CreateEmployeeRequestResource implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name = "No name";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
