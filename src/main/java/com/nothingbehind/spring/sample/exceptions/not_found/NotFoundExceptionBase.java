package com.nothingbehind.spring.sample.exceptions.not_found;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExceptionBase extends RuntimeException {
	public NotFoundExceptionBase(String message) {
		super(message);
	}
}

