package com.example.RegisterLogin.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user1")
public class User {
	@Id
	@Column(name="userid", length = 45)
	private String userid;
	
	@Column(name="password", length = 45)
	private String password;

	public User(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	public User() {
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
		return "User [userid=" + userid + ", password=" + password + "]";
	}
	
	
	
	
}