package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.firstproject.entity.Category;
import co.in.firstproject.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements ICategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Optional<Category> getCategoryById(Long categoryId) {
		return categoryRepository.findById(categoryId);
	}

	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

	public Category updateCategory(Long id, Category updatedCategory) {
		return categoryRepository.findById(id).map(category -> {
			category.setCategoryName(updatedCategory.getCategoryName());
			category.setDescription(updatedCategory.getDescription());
			return categoryRepository.save(category);
		}).orElseThrow(() -> new RuntimeException("Category not found"));
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
