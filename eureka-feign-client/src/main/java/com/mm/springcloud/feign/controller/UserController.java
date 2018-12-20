package com.mm.springcloud.feign.controller;

import com.mm.springcloud.feign.domain.User;
import com.mm.springcloud.feign.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@RequestMapping(value = "/registry",method = RequestMethod.POST)
	public User createUser(@RequestParam("username") String username
	, @RequestParam("password") String password) {
		return userService.create(username,password);
	}

}
