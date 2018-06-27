package com.thinkxfactor.zomatoplus.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.User;

@RestController
@RequestMapping("/user")
public class userpro {
	
	@PostMapping("/create")
	public User Register(@RequestBody User user ) {
		System.out.println(user.toString());
		return user;
	}
		
		@PostMapping("/login")
		public User Login(@RequestBody User user ) {
				return user;
	}
}
