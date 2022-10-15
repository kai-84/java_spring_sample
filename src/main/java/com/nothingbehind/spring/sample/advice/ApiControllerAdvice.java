package com.nothingbehind.spring.sample.advice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nothingbehind.spring.sample.exceptions.not_found.NotFoundExceptionBase;

@RestControllerAdvice
public class ApiControllerAdvice extends ResponseEntityExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundExceptionBase.class)
	public ResponseEntity<Object> handle404(NotFoundExceptionBase ex, WebRequest request) {
		return super.handleExceptionInternal(ex, "Not Found", new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
}
