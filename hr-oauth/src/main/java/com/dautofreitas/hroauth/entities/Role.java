package com.dautofreitas.hroauth.entities;

import java.io.Serializable;


public class Role implements Serializable{

	private static final long serialVersionUID = 1L;	
	private Long Id;
	private String roleName;
	
	public Role()
	{}

	public Role(Long id, String roleName) {
		super();
		Id = id;
		this.roleName = roleName;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
