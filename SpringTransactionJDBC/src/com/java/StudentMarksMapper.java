package com.java;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.POJO.StudentMarks;

public class StudentMarksMapper implements RowMapper<StudentMarks>{

	@Override
	public StudentMarks mapRow(ResultSet rs, int row) throws SQLException {
		StudentMarks stm = new StudentMarks();
		stm.setId(rs.getInt("id"));
		stm.setName(rs.getString("name"));
		stm.setAge(rs.getInt("age"));
		stm.setSid(rs.getInt("sid"));
		stm.setMarks(rs.getInt("marks"));
		stm.setYear(rs.getInt("year"));
		return stm;
	}
}
