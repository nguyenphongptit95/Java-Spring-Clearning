package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[]argv) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hobj = (HelloWorld) context.getBean("helloWorld");
		System.out.println(hobj.getMessage());
		System.out.println(HelloWorld.class);
	}
}
