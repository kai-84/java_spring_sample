package com.nothingbehind.spring.sample.exceptions.not_found;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.nothingbehind.spring.sample.ExceptionBase;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExceptionBase extends ExceptionBase {
	public NotFoundExceptionBase(String message, String code) {
		super(message, code);
	}
}
