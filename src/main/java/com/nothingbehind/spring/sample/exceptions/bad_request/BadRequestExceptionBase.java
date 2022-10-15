package com.nothingbehind.spring.sample.exceptions.bad_request;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nothingbehind.spring.sample.ExceptionBase;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestExceptionBase extends ExceptionBase {
	public BadRequestExceptionBase(String message, String code) {
		super(message, code);
	}
}

