package org.la.ecom.secure.exceptions;

public class AlreadyExistsException extends RuntimeException {
	
	private static final long serialVersionUID = 3021343645930986936L;

	public AlreadyExistsException(String message) {
        super(message);
    }
	
}