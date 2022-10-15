package com.nothingbehind.spring.sample.advice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nothingbehind.spring.sample.entities.MethodArgumentError;
import com.nothingbehind.spring.sample.exceptions.bad_request.BadRequestExceptionBase;
import com.nothingbehind.spring.sample.exceptions.not_found.NotFoundExceptionBase;

@RestControllerAdvice
public class ApiControllerAdvice extends ResponseEntityExceptionHandler {
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NotFoundExceptionBase.class)
	public ResponseEntity<Object> handle404(NotFoundExceptionBase ex, WebRequest request) {
		return super.handleExceptionInternal(ex, ex.getMessage(), new HttpHeaders(), HttpStatus.NOT_FOUND, request);
	}
	
	@Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(final MethodArgumentNotValidException ex, final HttpHeaders headers, final HttpStatus status, final WebRequest request) {
        System.out.println("===== handleMethodArgumentNotValid");
		final List<String> errors = new ArrayList<String>();
        for (final FieldError error : ex.getBindingResult().getFieldErrors()) {
        	MethodArgumentError e = new MethodArgumentError(error.getField(), error.getDefaultMessage());
            errors.add(e.printAll());
        }
        for (final ObjectError error : ex.getBindingResult().getGlobalErrors()) {
        	MethodArgumentError e = new MethodArgumentError(error.getObjectName(), error.getDefaultMessage());
            errors.add(e.printAll());
        }
        return handleExceptionInternal(ex, errors, headers, status, request);
    }

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<Object> handleMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException ex, WebRequest request) {
		String name = ex.getName();
	    String type = ex.getRequiredType().getSimpleName();
	    Object value = ex.getValue();
	    String message = String.format("'%s' should be a '%s' and '%s' isn't", name, type, value);
	    MethodArgumentError error = new MethodArgumentError(name, message);
	    
	    return super.handleExceptionInternal(ex, error.printAll(), new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
	}
}
