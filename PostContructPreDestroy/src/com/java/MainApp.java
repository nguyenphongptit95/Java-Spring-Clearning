package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String []args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		HelloWorld h = (HelloWorld) context.getBean("helloWorld");
		System.out.println(h.getMessage());
		context.registerShutdownHook();
	}
}
