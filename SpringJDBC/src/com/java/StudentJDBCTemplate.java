package com.java;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObj;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		jdbcTemplateObj = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, int age) {
		String sql = "insert into Student(name, age) values (? , ?)";
		jdbcTemplateObj.update(sql, name, age);
		System.out.println(String.format("Create %s, %d", name, age));
	}

	@Override
	public Student getStudent(int id) {
		String sql = "select * from Student where id = ?";
		Student st = jdbcTemplateObj.queryForObject(sql, new Object[] { id }, new StudentMapper());
		return st;
	}

	@Override
	public List<Student> listStudents() {
		String sql = "select * from Student";
		List<Student> l = jdbcTemplateObj.query(sql, new StudentMapper());
		return l;
	}

	@Override
	public void delete(int id) {
		String sql = "delete from Student where id = ?";
		jdbcTemplateObj.update(sql, new Object[] {id});
		System.out.println(String.format("Deleted id = %d", id));
	}

	@Override
	public void update(int id, int age) {
		String sql = "update Student set age = ? where id = ?";
		jdbcTemplateObj.update(sql, new Object[] {age, id});
		System.out.println(String.format("Update age of id = %d to %d", id, age));
	}

}
