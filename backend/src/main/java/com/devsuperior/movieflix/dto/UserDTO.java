package com.devsuperior.movieflix.dto;

import java.io.Serializable;

import com.devsuperior.movieflix.entities.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private String email;
	
	public UserDTO () {
		
	}
	
	public UserDTO (User entity) {
		id = entity.getId();
		name = entity.getName();
		email = entity.getEmail();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
