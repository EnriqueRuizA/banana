
package com.generation.jwd.p1.beans;

import java.io.Serializable;

public class LoginBean  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String user;
	private String password;
	
	public LoginBean() {	
	}
	
//	UserBean user1 = new UserBean(
//			"user1",
//			"12345"
//			);
//	
//	UserBean user2 = new UserBean(
//			"user2",
//			"32155"
//			);
//	
//	UserBean[] users = {user1, user2};
//	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean validator() {
		return this.password.equals("admin") && this.user.equals("admin");
	}	
}
