package com.java;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]argv) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(ContextConfig.class);
		context.start();
		HelloWorld h = (HelloWorld) context.getBean("helloWorld");
		System.out.println(h.getMessage());
		context.stop();
	}
}
