package com.bcserafim.projetoSpringBoot.services.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	
	public ResourceNotFoundException(Object id) {
		super("Resoucer not found. id: " + id);
		
	}
	
	
	

}
