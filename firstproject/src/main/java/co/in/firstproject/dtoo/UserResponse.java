package co.in.firstproject.dtoo;

public class UserResponse {
private Long userId;
	

	private String username;
	private String password;
	private String email;
	private String address;
	private String contactNumber;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public UserResponse(Long userId, String username, String password, String email, String address,
			String contactNumber) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		
	
	}
	
	
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserResponse [userId=" + userId + ", username=" + username + ", password=" + password + ", email="
				+ email + ", address=" + address + ", contactNumber=" + contactNumber + "]";
	}
	
	

}
