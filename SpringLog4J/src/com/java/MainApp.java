package com.java;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	static Log log = LogFactory.getLog(MainApp.class);
	//static Logger log = Logger.getLogger(MainApp.class);
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		log.info("Going to create HelloWorld obj...");
		HelloWorld h = (HelloWorld) context.getBean("helloWorld");
		System.out.println(h.getMessage());
		log.info("Exiting the program...");
	}
}
