package com.java;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		jdbcTemplate = new JdbcTemplate(ds);
		simpleJdbcCall = new SimpleJdbcCall(ds);
	}

	@Override
	public void create(int id, String name, int age) {
		simpleJdbcCall.setProcedureName("createStudent");
		SqlParameterSource param = new MapSqlParameterSource().addValue("in_id", id).addValue("in_name", name)
				.addValue("in_age", age);
		Map<String, Object> rs = simpleJdbcCall.execute(param);
		int rsInt = (int) rs.get("out_rs");
		if (rsInt == 0) {
			System.out.println("Add new Student successfully...");
		} else {
			System.out.println("Student'id has been exists...");
		}
	}

	@Override
	public List<Student> getStudents() {
		String sql = "call getStudents()";
		List<Student> list = jdbcTemplate.query(sql, new StudentMapper());
		return list;
	}

	@Override
	public Student getStudent(int id) {
		simpleJdbcCall.setProcedureName("getStudent");
		SqlParameterSource param = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> rs = simpleJdbcCall.execute(param);
		if (rs.size() > 0) {
			Student st = new Student();
			st.setId(id);
			st.setName(rs.get("out_name").toString());
			st.setAge((int) rs.get("out_age"));
			return st;
		}
		return null;
	}

	@Override
	public void update(int id, String name, int age) {
		simpleJdbcCall.setProcedureName("updateStudent");
		SqlParameterSource param = new MapSqlParameterSource().addValue("in_id", id).addValue("in_name", name)
				.addValue("in_age", age);
		simpleJdbcCall.execute(param);
		System.out.println("Update Student successfully...");
	}

	@Override
	public void delete(int id) {
		simpleJdbcCall.setProcedureName("deleteStudent");
		SqlParameterSource param = new MapSqlParameterSource()
				.addValue("in_id", id);
		Map<String, Object> rs = simpleJdbcCall.execute(param);

		int rsInt = (int) rs.get("out_rs");
		if (rsInt == 0) {
			System.out.println("Delete Student successfully...");
		} else {
			System.out.println("Delete fail...");
		}
	}

}
