package com.example.RegisterLogin.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class UserDTO {
	private String userid;
	private String password;
	
	public UserDTO(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	public UserDTO() {
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", password=" + password + "]";
	}
}
