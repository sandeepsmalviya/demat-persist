package com.invest19.demat.persist.exception;

//@RestControllerAdvice
public class ApplicationExceptionHandler {

	//@ExceptionHandler
	public void handleException(Exception ex) {

		System.out.println("I am called handleException");
		ex.printStackTrace();
	}
}
