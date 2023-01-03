package com.user.services;

import com.user.entity.Users;
import com.user.vo.ResponseTemplateVo;

public interface UserService {
	public Users saveUser(Users user);
	public Users findUserById(Long userId);
	public ResponseTemplateVo getDepartmentByUserId(Long userId);
}
