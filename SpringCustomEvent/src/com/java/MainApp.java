package com.java;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[]args) {		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomEventPublisher cep = context.getBean(CustomEventPublisher.class);
		cep.publish();
		cep.publish();
		cep.publish();
		cep.publish();
		cep.publish();
	}
}
