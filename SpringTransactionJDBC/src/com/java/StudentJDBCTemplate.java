package com.java;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.java.POJO.StudentMarks;

public class StudentJDBCTemplate implements StudentDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager platformTransactionManager;
	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * @param platformTransactionManager the platformTransactionManager to set
	 */
	public void setPlatformTransactionManager(PlatformTransactionManager platformTransactionManager) {
		this.platformTransactionManager = platformTransactionManager;
	}

	@Override
	public void create(int id, String name, int age, int marks, int year) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = this.platformTransactionManager.getTransaction(transactionDefinition);
		try {
			String sql = "insert into student (id, name, age) values (? , ? , ?)";
			jdbcTemplate.update(sql, id, name, age);
			
			sql = "insert into marks(sid, marks, year) values (?, ?, ?)";
			jdbcTemplate.update(sql, new Object[] {id, marks, year});
			
			platformTransactionManager.commit(transactionStatus);
			System.out.println("Create successfully...");
		} catch (Exception e) {
			platformTransactionManager.rollback(transactionStatus);
			System.out.println(e.toString());
		}
	}

	@Override
	public List<StudentMarks> listStudents() {
		String sql = "call getStudentMarks()";
		List<StudentMarks> list = jdbcTemplate.query(sql, new StudentMarksMapper());
		return list;
	}

}
