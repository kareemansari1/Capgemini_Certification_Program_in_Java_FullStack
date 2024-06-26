package com.springonetoone.Service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springonetoone.Entity.Student;
import com.springonetoone.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository sr;
	
	public List<Student> getStudents() {
		
		return sr.findAll();
	}

	public Student saveStudent(@Valid Student p1) {
		
		return sr.save(p1);
	}

	public void deleteStudent(int id) {
		Student s = sr.getById(id);
		sr.delete(s);
		
	}

	public Student updateStudent(@Valid Student p1, int id) {
		p1.setStudentId(id);
		return sr.save(p1);
	}

}
