package com.java;
import javax.annotation.*;
public class HelloWorld {
	private String message;
	//@PreDestroy
	public void destroy() {
		System.out.println("Bean will be destroy now.");
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	//@PostContruct
	public void init() {
		System.out.println("Bean going to through init");
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
}
