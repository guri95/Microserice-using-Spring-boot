package com.user.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.Users;
import com.user.services.UserServiceImpl;
import com.user.vo.ResponseTemplateVo;

@RestController 
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

	@Autowired 
	private UserServiceImpl userService;
	
	@PostMapping("/")
	public Users saveUser(@RequestBody Users user) {
		logger.info("Inside saveDepartment api call");
		return userService.saveUser(user);
	}
	/*
	 * @GetMapping("/{id}") public Users findUserById(@PathVariable("id") Long
	 * userId) { return userService.findUserById(userId); }
	 */
	
	@GetMapping("/{id}")
	public ResponseTemplateVo getDepartmentByUserId(@PathVariable("id") Long userId) {
		return userService.getDepartmentByUserId(userId);
	}
}
