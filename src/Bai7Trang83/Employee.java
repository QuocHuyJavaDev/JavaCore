package Bai7Trang83;

public class Employee {
	private String firstName;
	private String lastName;
	private double lasary;
	public Employee() {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.lasary = lasary;
	}
	
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getLasary() {
		return lasary;
	}


	public double setLasary(double lasary) {
		if (lasary < 0) {
			return this.lasary = 0.0;
		} else {
			return this.lasary = lasary;	
		}
		
	}


}
