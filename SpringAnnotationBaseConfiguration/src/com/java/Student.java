package com.java;
import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	@Required
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@Required
	public void setName(String name) {
		this.name = name;
	}
	
}
