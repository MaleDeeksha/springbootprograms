package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Department;
import com.spring.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	public DepartmentService departmentService;

	@GetMapping("/departmentlist")
	public List<Department> getDepartment(@RequestBody Department department){
		return this.departmentService.listAll();
	}
	@PostMapping("/adddepartment")
	public Department addDepartment(@RequestBody Department d) {
		return this.departmentService.addDepartment(d);
	}

}
