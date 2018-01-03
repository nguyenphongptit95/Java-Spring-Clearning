package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[]args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		StudentJDBCTemplate stTemplate = context.getBean(StudentJDBCTemplate.class);
//		stTemplate.create(6, "Trân", 30);
//		List<Student> list = stTemplate.getStudents();
//		for(Student st: list) {
//			System.out.println(st.toString());
//		}
//		Student st = stTemplate.getStudent(6);
//		System.out.println(st.toString());
//		stTemplate.update(1, "Phong Vân", 70);
		stTemplate.delete(2);
		stTemplate.delete(3);
		stTemplate.delete(4);
		stTemplate.delete(5);
		stTemplate.delete(6);
	}
}
