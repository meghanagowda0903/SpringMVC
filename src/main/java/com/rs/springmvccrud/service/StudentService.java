package com.rs.springmvccrud.service;
import org.springframework.stereotype.Service;

import com.rs.springmvccrud.dao.StudentDAO;
import com.rs.springmvccrud.dto.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class StudentService {
	
	@Autowired
	private StudentDAO studentDAO;

	public Student createStudent(Student stu) {
		return studentDAO.createStudent(stu);
	}
	
	public List<Student> getAllStudent(){
		return studentDAO.getAllStudent();
	}
	
	public void deleteStudent(int id) {
		 studentDAO.deleteStudent(id);
	}
	}
