package com.ey.springboot3security.entity;

import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest { 

	private String username; 
	private String password;
	public Object getUsername() {
		
		return username;
	}
	public Object getPassword() {
		// TODO Auto-generated method stub
		return password;
	} 

}
