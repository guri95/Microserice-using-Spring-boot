package com.department.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.services.DepartmentServiceImpl;

@RestController 
@RequestMapping("/departments")
public class DepartmentController {
    private static final Logger logger = LogManager.getLogger(DepartmentController.class);

	@Autowired 
	private DepartmentServiceImpl departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		logger.info("Inside saveDepartment api call");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.findDepartmentById(departmentId);
	}
}
