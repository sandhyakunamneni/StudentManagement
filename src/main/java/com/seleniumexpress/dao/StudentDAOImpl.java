package com.seleniumexpress.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.extractors.StudentResultSetExtractor;


@Repository
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		String sqlCommand="SELECT * FROM STUDENTS";
		List<Student> students=jdbcTemplate.query(sqlCommand, new StudentResultSetExtractor());
		System.out.println(students.size());
		return students;
	}

}
