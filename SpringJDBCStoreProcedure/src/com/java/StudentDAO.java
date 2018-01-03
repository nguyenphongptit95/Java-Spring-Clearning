package com.java;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {
	void setDataSource(DataSource ds);
	void create(int id, String name, int age);
	List<Student> getStudents();
	Student getStudent(int id);
	void update(int id, String name, int age);
	void delete(int id);
}
