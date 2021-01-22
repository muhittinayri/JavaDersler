package com.oop.ExceptionKendi.main;

public class InvalidAgeException extends ArithmeticException {
	
	public InvalidAgeException(String message) {
		super(message);
	}
	
	@Override
	public void printStackTrace() {
		System.out.println("Bu bir invalid Age hatasýdýr...");
	}
	
}
