package com.java;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int row) throws SQLException {
		Student st = new Student();
		st.setId(rs.getInt("id"));
		st.setName(rs.getString("name"));
		st.setAge(rs.getInt("age"));
		return st;
	}
}
