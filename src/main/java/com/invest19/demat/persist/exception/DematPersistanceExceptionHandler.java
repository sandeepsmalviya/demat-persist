package com.invest19.demat.persist.exception;

import java.util.Date;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.invest19.demat.persist.exception.error.DemoErrorMessage;

//@ControllerAdvice
public class DematPersistanceExceptionHandler // extends ResponseEntityExceptionHandler
{

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest webRequest) {

		String errorMessageDescription = ex.getLocalizedMessage();
		if (errorMessageDescription == null) {
			errorMessageDescription = ex.toString();
		}

		errorMessageDescription = errorMessageDescription + "\n" + " Default Exception Handler is called";
		System.out.println(errorMessageDescription);

		DemoErrorMessage errorMessage = new DemoErrorMessage(errorMessageDescription, new Date());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest webRequest) {

		String errorMessageDescription = ex.getLocalizedMessage();
		if (errorMessageDescription == null) {
			errorMessageDescription = ex.toString();
		}

		errorMessageDescription = errorMessageDescription + "\n" + " NullPointerException Exception Handler is called";
		System.out.println(errorMessageDescription);

		DemoErrorMessage errorMessage = new DemoErrorMessage(errorMessageDescription, new Date());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = EntityNotFoundException.class)
	public ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException ex, WebRequest webRequest) {

		String errorMessageDescription = ex.getLocalizedMessage();
		if (errorMessageDescription == null) {
			errorMessageDescription = ex.toString();
		}

		errorMessageDescription = errorMessageDescription + "\n"
				+ " EntityNotFoundException Exception Handler is called";
		System.out.println(errorMessageDescription);

		DemoErrorMessage errorMessage = new DemoErrorMessage(errorMessageDescription, new Date());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = IllegalArgumentException.class)
	public ResponseEntity<Object> handleIllegalArgumentException(IllegalArgumentException ex, WebRequest webRequest) {

		String errorMessageDescription = ex.getLocalizedMessage();
		if (errorMessageDescription == null) {
			errorMessageDescription = ex.toString();
		}

		errorMessageDescription = errorMessageDescription + "\n"
				+ " IllegalArgumentException Exception Handler is called";
		System.out.println(errorMessageDescription);

		DemoErrorMessage errorMessage = new DemoErrorMessage(errorMessageDescription, new Date());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
	}

	/*
	 * @ExceptionHandler(value = ValidationConstr.class) public
	 * ResponseEntity<Object>
	 * handleMethodArgumentNotValidException(MethodArgumentNotValidException ex,
	 * WebRequest webRequest) {
	 * 
	 * String errorMessageDescription = ex.getLocalizedMessage(); if
	 * (errorMessageDescription == null) { errorMessageDescription = ex.toString();
	 * }
	 * 
	 * errorMessageDescription = errorMessageDescription + "\n" +
	 * " MethodArgumentNotValidException Exception Handler is called";
	 * System.out.println(errorMessageDescription);
	 * 
	 * ErrorMessage errorMessage = new ErrorMessage(errorMessageDescription, new
	 * Date()); return new ResponseEntity<Object>(errorMessage, new HttpHeaders(),
	 * HttpStatus.BAD_REQUEST); }
	 */}
