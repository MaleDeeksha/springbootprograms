package com.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.Employee;
import com.spring.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	public EmployeeRepository employeeRepository;

	public List<Employee> listAll(){
		return employeeRepository.findAll();
	}
	
	public Employee SearchById(int id) {
		return employeeRepository.findById(id).get();
	}
	/*public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);

	}*/

}
