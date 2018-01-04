package com.java;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.POJO.StudentMarks;

public class MainApp {
	public static void main(String[]args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		//studentJDBCTemplate.create(3, "Trân", 20, 10, 10);
		List<StudentMarks> list = studentJDBCTemplate.listStudents();

		for(StudentMarks stm :list) {
			System.out.println(stm.toString());
		}
	}
}
