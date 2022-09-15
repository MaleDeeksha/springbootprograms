package com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.Student;

//import com.javainterviewpoint.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

}

