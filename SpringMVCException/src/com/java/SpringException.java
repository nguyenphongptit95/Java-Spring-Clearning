package com.java;

public class SpringException extends RuntimeException{
	private String exMessage;

	public SpringException(String exMessage) {
		super();
		this.exMessage = exMessage;
	}

	/**
	 * @return the exMessage
	 */
	public String getExMessage() {
		return exMessage;
	}

	/**
	 * @param exMessage the exMessage to set
	 */
	public void setExMessage(String exMessage) {
		this.exMessage = exMessage;
	}
	
}
