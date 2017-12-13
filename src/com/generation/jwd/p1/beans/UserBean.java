package com.generation.jwd.p1.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String surname;
	private String email;

	public UserBean(String name, String surname, String email){
		this.name = name;
		this.surname = surname;
		this.email = email;
	};
	
	public UserBean() {
		
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSupername() {
		return surname;
	}
	public void setSupername(String supername) {
		this.surname = supername;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
