package com.generation.jwd.p1.beans;

import java.io.Serializable;

public class LoginBean  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	private String password;
	
	public LoginBean(String user, String password){
		this.user = user;
		this.password = password;
	}
	
	public LoginBean(){
		
	}
	
	public String getId() {
		return user;
	}
	public void setId(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validatorpass() {
		return this.password.equals("admin");
	}
	
	public boolean validatoradmin() {
		return this.user.equals("admin");
	}
}
