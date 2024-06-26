package com.springonetoone.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.springonetoone.Entity.Student;
import com.springonetoone.Service.StudentService;

@RestController
public class StudentController 
{
	@Autowired
	public StudentService ss;
	
	@GetMapping("/student")
	List<Student> getstudents()
	{
		return this.ss.getStudents();
	}
	/*"studentName":"Nihar",
    "trainer":{
        "trainerId": 1,
        "trainerName": "Pooja"
    }*/
	@PostMapping("/student")
	public Student addStudent(@Valid @RequestBody Student p1) {
		return this.ss.saveStudent(p1);
	}
	
	@DeleteMapping("/student/{id}")
	public void deleteStudent(@PathVariable int id)
	{
		ss.deleteStudent(id);
	}
	
	@PutMapping("/student/update/{id}")
	public Student  updateStudent(@Valid @RequestBody Student p1,@PathVariable int id) {
		return this.ss.updateStudent(p1,id);
	}
}
