package com.department.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
    private static final Logger logger = LogManager.getLogger(DepartmentServiceImpl.class);

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		logger.info("in saveDepartment Service");
		return departmentRepository.save(department);
	}
	
	@Override
	public Department findDepartmentById(Long departmentId) {
		logger.info("in findDepartmentById Service");

		return departmentRepository.findById(departmentId).get();
	}
}
