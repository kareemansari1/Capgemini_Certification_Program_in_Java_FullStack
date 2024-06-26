package com.springonetoone.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springonetoone.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

	

}
