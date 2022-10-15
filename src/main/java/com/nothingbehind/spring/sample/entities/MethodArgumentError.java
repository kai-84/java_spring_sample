package com.nothingbehind.spring.sample.entities;

import java.io.Serializable;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class MethodArgumentError implements Serializable {
	private static final long serialVersionUID = 1L;
	private String field;
	private String message;
	
	public MethodArgumentError(String field, String message) {
		setField(field);
		setMessage(message);
	}
	
	public String printAll() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}