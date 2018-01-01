package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[]ar) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
		B b = context.getBean(B.class);
		A a = context.getBean(A.class);
	}
}
