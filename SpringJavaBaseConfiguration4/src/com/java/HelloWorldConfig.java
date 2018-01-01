package com.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class HelloWorldConfig {
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	
	@Bean
	@Scope("singleton")
	public HelloWorld helloWorld1() {
		return new HelloWorld();
	}
}
