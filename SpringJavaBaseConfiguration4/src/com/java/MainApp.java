package com.java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[]argv) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld h1 = (HelloWorld) context.getBean("helloWorld1");
		h1.setMessage("Phong");
		System.out.println(h1.getMessage());
		HelloWorld h2 = (HelloWorld) context.getBean("helloWorld1");
		System.out.println(h2.getMessage());
		context.registerShutdownHook();
	}
}
