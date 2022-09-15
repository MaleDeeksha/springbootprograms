package com.spring.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Passport;
import com.spring.model.Student;

//import com.javainterviewpoint.model.Passport;
//import com.javainterviewpoint.model.Student;

@Repository
public interface PassportRepository extends CrudRepository<Passport, Integer>
{
	@Query("select s from Student s where id= :studentid")
	public Student getStudent(int studentid);
}

