package com.java;

import java.util.List;

import javax.sql.DataSource;

import com.java.POJO.StudentMarks;

public interface StudentDAO {
	void setDataSource(DataSource ds);
	void create(int id, String name, int age, int marks, int year);
	List<StudentMarks> listStudents();
}
