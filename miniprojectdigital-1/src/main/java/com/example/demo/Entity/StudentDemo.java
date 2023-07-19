package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="market")
public class StudentDemo {
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	public StudentDemo(String username, String password
			) {
		super();
		this.username = username;
		this.password = password;
	}
	public StudentDemo() {
		
	}
	
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username= username;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password=password;
		
	}
}