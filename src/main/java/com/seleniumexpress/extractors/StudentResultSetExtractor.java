package com.seleniumexpress.extractors;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.seleniumexpress.api.Student;

public class StudentResultSetExtractor implements ResultSetExtractor<List<Student>> {

	@Override
	public List<Student> extractData(ResultSet res) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		
		 List<Student> students= new ArrayList<>();
	        while(res.next()) {
	            Student student= new Student();
	            student.setId(res.getInt("id"));
	            student.setName(res.getString("name"));
	            student.setMobile(res.getLong("mobile"));
	            student.setCountry(res.getString("country"));
	            students.add(student);
	        }
	    	System.out.println(students.size());
	        return students;
	}

}
