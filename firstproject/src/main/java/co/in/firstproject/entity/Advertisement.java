package co.in.firstproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "advertisement")
public class Advertisement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long advertisementId;

	private String title;
	private String description;
	private Double price;
	private String status; // e.g., NEW, OPEN, CLOSED

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id", nullable=false)
	private User users;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="category_id", nullable=false)
	private Category category;

	public Long getId() {
		return advertisementId;
	}

	public void setId(Long id) {
		this.advertisementId = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public User getUser() {
		return users;
	}

	public void setUser(User user) {
		this.users = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Advertisement [id=" + advertisementId + ", title=" + title + ", description=" + description + ", price=" + price
				+ ", status=" + status + ", user=" + users + ", category=" + category + "]";
	}

	public Advertisement(Long id, String title, String description, Double price, String status, User user,
			Category category) {
		super();
		this.advertisementId = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.status = status;
		this.users = user;
		this.category = category;
	}

	public Advertisement() {
		super();
		// TODO Auto-generated constructor stub
	}

}
