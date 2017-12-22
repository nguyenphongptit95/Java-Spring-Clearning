package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String []a) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.getSc1().checkSpelling();
		System.out.println(te.getName());
		//te.getSc2().checkSpelling();
	}
}
