package com.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student1")
	private Student student;
	public Profile() {
		System.out.println("Inside Profile contructor.");
	}

	public void printAge() {
		System.out.println(student.getAge());
	}

	public void printName() {
		System.out.println(student.getName());
	}
}
