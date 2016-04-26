package com.my.shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "login", length = 20)
	private String login;
	@Column(name = "password", length = 20)
	private String password;
	@Column(name = "role", length = 10)
	private String role;
	
	public User() { }
	
	public User(long id, String login, String password) {
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User {\nid=" + id + ", \nlogin=" + login + 
				", \npassword=" + password + 
				", \nrole=" + role + "}";
	}
	
}
