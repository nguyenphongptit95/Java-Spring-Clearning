package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public CustomEventHandler customEventHandler() {
		return new CustomEventHandler();
	}
	
	@Bean
	public CustomEventPublisher customEventPublisher() {
		return new CustomEventPublisher();
	}
}
