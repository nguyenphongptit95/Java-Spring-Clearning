package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		StudentJDBCTemplate studentJDBCTemplate =  (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
//		studentJDBCTemplate.create("Phong", 22);
//		studentJDBCTemplate.create("Vân", 22);
//		studentJDBCTemplate.create("Trân", 22);
//		studentJDBCTemplate.create("Phụng", 22);
		
		List<Student> list = studentJDBCTemplate.listStudents();
		for(Student st: list) {
			System.out.println(st.getId() + " - " + st.getName() + " - " + st.getAge());
		}

		studentJDBCTemplate.delete(6);
		studentJDBCTemplate.delete(7);
		
		list = studentJDBCTemplate.listStudents();
		for(Student st: list) {
			System.out.println(st.getId() + " - " + st.getName() + " - " + st.getAge());
		}
		
		studentJDBCTemplate.update(8, 50);
		
		list = studentJDBCTemplate.listStudents();
		for(Student st: list) {
			System.out.println(st.getId() + " - " + st.getName() + " - " + st.getAge());
		}
	}
}
