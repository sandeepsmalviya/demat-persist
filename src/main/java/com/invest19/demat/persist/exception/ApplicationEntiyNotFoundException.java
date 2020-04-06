package com.invest19.demat.persist.exception;

public class ApplicationEntiyNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 5518815883073769690L;

	public ApplicationEntiyNotFoundException() {
		super();
	}

	public ApplicationEntiyNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ApplicationEntiyNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationEntiyNotFoundException(String message) {
		super(message);
	}

	public ApplicationEntiyNotFoundException(Throwable cause) {
		super(cause);
	}

	public ApplicationEntiyNotFoundException(Exception exception) {
		super(exception);
	}

}
