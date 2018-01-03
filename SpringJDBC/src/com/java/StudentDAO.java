package com.java;

import java.util.List;
import javax.sql.DataSource;

public interface StudentDAO {
	void setDataSource(DataSource ds);
	void create(String name, int age);
	Student getStudent(int id);
	List<Student> listStudents();
	void delete(int id);
	void update(int id, int age);
}
