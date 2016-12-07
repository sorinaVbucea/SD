package Model;

//import org.hibernate.mapping.Set;

public class User {
	
	private int id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String role;
	//private Set flight;
	
	public User(){}
	
	public User(String username, String password, String firstname, String lastname, String role){
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

//	public Set getFlight() {
//		return flight;
//	}
//
//	public void setFlight(Set flight) {
//		this.flight = flight;
//	}
//	
}
