package com.javainterviewpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.javainterviewpoint.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

}
