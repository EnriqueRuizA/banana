package bananawebproyect;

public class UserBean {

	String name;
	String surname;
	String department;
	String email;
	String role;
	String imageUrl;
	
	UserBean(String name, String surname, String department, String email, String role, String imageURL, String imageUrl){
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.email = email;
		this.role = role;
		this.imageUrl = imageUrl;
	};
	
	UserBean(){
		
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
