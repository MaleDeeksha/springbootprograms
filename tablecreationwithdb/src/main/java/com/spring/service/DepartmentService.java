package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Department;
import com.spring.repository.DepartmentRepository;
@Service
@Transactional
public class DepartmentService {
	@Autowired
	public DepartmentRepository departmentRepository;

	public List<Department> listAll(){
		return departmentRepository.findAll();
	}
	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}
	/*public Department searchByID(int dId) {
		return departmentRepository.findById(dId).get();
	}*/
	public Department searchById(int dId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(dId).get();

	}

}
