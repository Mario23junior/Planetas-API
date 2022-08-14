package com.api.planetas.exceptions;

public class ReturnErroFindNotFound extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ReturnErroFindNotFound(String msg) {
		super(msg);
	}
}
