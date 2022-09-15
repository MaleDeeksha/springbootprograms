package com.spring.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Department;
import com.spring.entity.Employee;
import com.spring.service.DepartmentService;
import com.spring.service.EmployeeService;
@RestController
public class EmployeeController {
	@Autowired
	 public EmployeeService employeeservice;
	@Autowired
	 public DepartmentService departmentservice;
	 
	@GetMapping("/employeelist")
	public List<Employee>getEmployee(){
		return this.employeeservice.listAll();
	}
	/*@PostMapping("/addemployee/{dId}")
	public Employee addEmployee(@RequestBody Employee employee, @RequestParam("dId") int dId) {
		Department d  = this.departmentservice.searchById(dId);
		employee.setDepartment(d);
		return this.employeeservice.addEmployee(employee);
	}*/
	


}
