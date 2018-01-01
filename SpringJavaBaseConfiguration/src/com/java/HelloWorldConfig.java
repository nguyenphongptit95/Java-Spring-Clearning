package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld() {
		HelloWorld h = new HelloWorld();
		h.setMessage("phong");
		return h;
	}
	@Bean
	public HelloWorld helloWorld1() {
		HelloWorld h = new HelloWorld();
		h.setMessage("van");
		return h;
	}
}
