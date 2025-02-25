package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/user/login")	
	public String login(@RequestBody Map<String, String> request) {
		String name = request.get("name");
		String password = request.get("password");
		String typeOfUser = service.authenticateUser(name, password);
		if(typeOfUser.equalsIgnoreCase("customer")) {
			return "WELCOME TO CUSTOMER DASHBOARD";
		}else if(typeOfUser.equalsIgnoreCase("admin")) {
			return "WELCOME TO ADMIN DASHBOARD";
		}else {
			return "INVALID USERNAME OR PASSWORD";
		}
	}
	
}
