package Chap01;

public class Admin extends Person{

	private String id = "Admin";
	private String password = "Admin1234";
	
	public Admin(String name, int phone) {
		super(name, phone);
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}
	

	
	
}
