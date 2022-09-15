package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Student;
import com.spring.repository.StudentRepository;

@Service
@Transactional
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;

	public Iterable<Student> listAll(){
		return studentRepository.findAll();
	}
	public Student addPassport(Student s) {
		return studentRepository.save(s);
	}
	public Student SerarchById(int id) {
		return studentRepository.findById(id).get();
	}

}
