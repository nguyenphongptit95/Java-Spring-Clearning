package com.java;

public class HelloWorld {
	private String message;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("Init...");
	}
	
	public void destroy() {
		System.out.println("Destroy....");
	}
}
