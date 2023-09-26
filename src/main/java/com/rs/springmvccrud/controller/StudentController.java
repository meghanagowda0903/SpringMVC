package com.rs.springmvccrud.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.rs.springmvccrud.dto.Student;
import com.rs.springmvccrud.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String homePage() {
		return "welcome";
	}
	
	@PostMapping("/create")

	public ModelAndView createStudent(@ModelAttribute("student") Student student, ModelAndView mv){
		Student stu=studentService.createStudent(student);
		mv.setViewName("welcome");
		mv.addObject("student", stu);
		return mv;
		
	}
	
	 @GetMapping("/student-list")
	    public String getAllStudent(Model model) {
	        List<Student> students = studentService.getAllStudent();
	        model.addAttribute("students", students);
	        return "student-list"; 
	    }
	 
	
	 @GetMapping("/delete/{id}")
	    public String deleteStudent(@PathVariable int id) {
	        studentService.deleteStudent(id);
	        return "redirect:/student-list";
	    }

}

