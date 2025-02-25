package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {


		UserRepository repository;
		@Autowired
		public UserService(UserRepository repository) {
			this.repository = repository;
			
		}
	
		public String authenticateUser(String name, String password) {
			User user = repository.findByName(name);
			if(user == null) {
				return "Invalid User";
			}else {
				if(password.equals(user.getPassword())) {
					return user.getRole();
				}else {
					return "Invalid User";
				}
			}
		}
}
