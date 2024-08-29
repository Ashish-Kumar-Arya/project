package com.example.RegisterLogin.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RegisterLogin.Dto.UserDTO;
import com.example.RegisterLogin.Service.UserService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/user")

public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(path="/save")
	public String saveUser(@RequestBody UserDTO userDTO) {
		String id = userService.addUser(userDTO);
		return id;
	}
}