package com.izamim.bazar.service.exception;

public class ResourceNotFound extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFound(Object id) {
		super("Resource Not Found. Id " + id);
		
	}


}
