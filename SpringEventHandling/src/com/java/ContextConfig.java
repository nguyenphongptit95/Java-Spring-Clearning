package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfig {
	@Bean
	public CStartEventHandler cStartEventHandler() {
		return new CStartEventHandler();
	}
	
	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
	@Bean
	public CStopEventHandler cStopEventHandler() {
		return new CStopEventHandler();
	}
}

