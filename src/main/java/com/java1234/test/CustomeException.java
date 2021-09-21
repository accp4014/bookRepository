package com.java1234.test;

public class CustomeException extends Exception{

	public CustomeException(String message) {
		super(message);
		System.out.print(message);
	}

	@Override
	public String toString() {
		return "CustomeException []";
	}

	
}
