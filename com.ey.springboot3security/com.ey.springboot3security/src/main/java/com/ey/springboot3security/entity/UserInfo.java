package com.ey.springboot3security.entity;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userinfo")
public class UserInfo { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id; 
	private String name; 
	private String email; 
	private String password; 
	private String roles;
	
	public UserInfo() {
		
	}
	
	public UserInfo(int id ,String name, String email, String password,String roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	public void setPassword(String encode) {
		this.password = encode;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public String getRoles() {
		// TODO Auto-generated method stub
		return roles;
	} 
	
	

} 
