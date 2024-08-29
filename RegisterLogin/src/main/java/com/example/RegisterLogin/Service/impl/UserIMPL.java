package com.example.RegisterLogin.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.Entity.User;
import com.example.RegisterLogin.Repo.UserRepo;
import com.example.RegisterLogin.Service.UserService;

public class UserIMPL implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public String addUser(UserDTO userDTO) {
		User user = new User(
				userDTO.getUserid(),
				userDTO.getPassword()
				);
		userRepo.save(user);
		return user.getUserid();
	}
	
}
