package com.nothingbehind.spring.sample;

public class ExceptionBase extends RuntimeException {

	private String code;

	public ExceptionBase(String message, String code) {
		super(message);
		setCode(code);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
