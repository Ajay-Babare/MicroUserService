package com.user.service.exception;

public class ResourceNotFoundException extends RuntimeException {

	ResourceNotFoundException(){
		super("Resource not found at server !!");
	}
	public ResourceNotFoundException(String message){
		super(message);
	}
}
