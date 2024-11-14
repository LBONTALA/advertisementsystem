package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import co.in.firstproject.entity.Category;

public interface ICategoryService {
	List<Category> getAllCategories();
	
	Optional<Category> getCategoryById(Long categoryId);
	Category createCategory(Category category);
	Category updateCategory(Long categoryId, Category updatedCategory);
	void deleteCategory(Long categoryId);

}
