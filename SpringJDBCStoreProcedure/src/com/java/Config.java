package com.java;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/springfirst");
		ds.setUsername("root");
		ds.setPassword("phongvan");
		return ds;
	}
	
	@Bean
	public StudentJDBCTemplate studentJDBCTemplate() {
		StudentJDBCTemplate stJDBC = new StudentJDBCTemplate();
		stJDBC.setDataSource(dataSource());
		return stJDBC;
	}
}
