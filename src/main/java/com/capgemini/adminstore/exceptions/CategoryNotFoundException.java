package com.capgemini.adminstore.exceptions;

public class CategoryNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CategoryNotFoundException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CategoryNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
