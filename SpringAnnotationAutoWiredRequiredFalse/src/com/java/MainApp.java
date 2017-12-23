package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]a) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		Student st = (Student) context.getBean("student");
		System.out.println(st.getAge());
		System.out.println(st.getName());
	}
}
