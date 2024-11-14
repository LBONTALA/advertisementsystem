package co.in.firstproject.dtoo;

public class CategoryResponse {
	
	private Long categoryId;

	private String categoryName;

	private String description;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public CategoryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategoryResponse(Long categoryId, String categoryName, String description) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "CategoryResponse [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description="
				+ description + "]";
	}
	
	
	
}
