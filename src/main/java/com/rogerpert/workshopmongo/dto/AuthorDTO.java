package com.rogerpert.workshopmongo.dto;

import java.io.Serializable;

import com.rogerpert.workshopmongo.domain.User;

public class AuthorDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	
	public AuthorDTO() {
	}
	
	public AuthorDTO (User obj) {
		id = obj.getId();
		name = obj.getName();
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
