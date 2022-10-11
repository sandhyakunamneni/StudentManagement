package com.seleniumexpress.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.seleniumexpress.api.Student;
import com.seleniumexpress.dao.StudentDAO;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	
	@GetMapping("/")
	public String showStudent(Model model)
	{
		List<Student> students=studentDAO.loadStudents();
		model.addAttribute("students", students);
		for(Student s:students)
		{
			System.out.println(s);
		}
		System.out.println(students.size());
		return "student-list";
	}

}
