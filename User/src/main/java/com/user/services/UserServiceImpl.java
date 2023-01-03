package com.user.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Users;
import com.user.repository.UserRepository;
import com.user.vo.Department;
import com.user.vo.ResponseTemplateVo;

@Service
public class UserServiceImpl implements UserService{
    private static final Logger logger = LogManager.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Users saveUser(Users user) {
		logger.info("in saveuser Service");
		return userRepository.save(user);
	}
	
	@Override
	public Users findUserById(Long userId) {
		logger.info("in findDepartmentById Service");

		return userRepository.findById(userId).get();
	}
	
	@Override
	public ResponseTemplateVo getDepartmentByUserId(Long userId) {
		ResponseTemplateVo response = new ResponseTemplateVo();
		Users user = findUserById(userId);
		Department department = restTemplate.getForObject("http://localhost:8081/departments/"+user.getDepartmentId(), Department.class);
		response.setDepartment(department);
		response.setUsers(user);
		return response;
	}
}
