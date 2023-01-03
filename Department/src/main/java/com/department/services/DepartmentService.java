package com.department.services;

import com.department.entity.Department;

public interface DepartmentService {
	public Department saveDepartment(Department department);
	public Department findDepartmentById(Long departmentId);
}
