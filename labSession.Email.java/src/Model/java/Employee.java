package Model.java;

public class Employee {
 // first name 
 //last name 
 // email
 //password
 //Department
	private String firstname ;
	private String lastname ;
	private String Email ;
	private String Password ;
	private String Department ;
	
	
	public Employee (String firstname ,String lastname ) {
		  this.firstname = firstname;
		  this.setLastName(lastname) ;
	}
	
	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}
	
	
}
 
