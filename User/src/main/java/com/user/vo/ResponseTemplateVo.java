package com.user.vo;

import com.user.entity.Users;

public class ResponseTemplateVo {
	
	private Department department;
	private Users users;
	
	public ResponseTemplateVo() {
		super();
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	
	
}
