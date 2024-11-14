package co.in.firstproject.dtoo;

public class AdvertisementResponse {

	private Long advertisementId;

	private String title;
	private String description;
	private Double price;
	private String status; // e.g., NEW, OPEN, CLOSED

	private CategoryResponse categoryResponse;

	public Long getAdvertisementId() {
		return advertisementId;
	}

	public void setAdvertisementId(Long advertisementId) {
		this.advertisementId = advertisementId;
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

	public CategoryResponse getCategoryResponse() {
		return categoryResponse;
	}

	public void setCategoryResponse(CategoryResponse categoryResponse) {
		this.categoryResponse = categoryResponse;
	}

	public AdvertisementResponse(Long advertisementId, String title, String description, Double price, String status,
			CategoryResponse categoryResponse) {
		super();
		this.advertisementId = advertisementId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.status = status;
		this.categoryResponse = categoryResponse;
	}

	public AdvertisementResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AdvertisementResponse [advertisementId=" + advertisementId + ", title=" + title + ", description="
				+ description + ", price=" + price + ", status=" + status + ", categoryResponse=" + categoryResponse
				+ "]";
	}
	
	

}
