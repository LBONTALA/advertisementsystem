package co.in.firstproject.entity;



import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tb")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	

	private String username;
	private String password;
	private String email;
	private String address;
	private String contactNumber;
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Advertisement> advertisement = new ArrayList<>();
	
	
	
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
	public List<Advertisement> getAdvertisement() {
		return advertisement;
	}
	public void setAdvertisement(List<Advertisement> advertisement) {
		this.advertisement = advertisement;
	}

	public User(Long userId, String username, String password, String email, String address, String contactNumber,
			List<Advertisement> advertisement) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
		this.advertisement = advertisement;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", address=" + address + ", contactNumber=" + contactNumber + ", advertisement=" + advertisement
				+ "]";
	}
	
}
	
	
	
	
	
	
	
