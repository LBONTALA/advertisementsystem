package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.firstproject.dtoo.AdvertisementResponse;
import co.in.firstproject.dtoo.CategoryResponse;
import co.in.firstproject.dtoo.UserResponse;
import co.in.firstproject.entity.Advertisement;
import co.in.firstproject.entity.Category;
import co.in.firstproject.entity.User;
import co.in.firstproject.repository.AdvertisementRepository;
import co.in.firstproject.repository.CategoryRepository;
import co.in.firstproject.repository.UserRepository;

@Service
public class AdvertisementServiceImpl implements IAdvertisementService {

	@Autowired
	private AdvertisementRepository advertisementRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Advertisement> getAllAdvertisements() {
		return advertisementRepository.findAll();
	}

	@Override
	public Optional<Advertisement> getAdvertisementById(Long id) {
		return advertisementRepository.findById(id);
	}

	@Override
	public Advertisement createAdvertisement(Advertisement advertisement, Long userId, Long categoryId) {
		User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
		Category category = categoryRepository.findById(categoryId)
				.orElseThrow(() -> new RuntimeException("Category not found"));

		advertisement.setUser(user);
		advertisement.setCategory(category);
		return advertisementRepository.save(advertisement);
	}

	@Override
	public Advertisement updateAdvertisement(Long id, Advertisement updatedAdvertisement) {
		return advertisementRepository.findById(id).map(ad -> {
			ad.setTitle(updatedAdvertisement.getTitle());
			ad.setDescription(updatedAdvertisement.getDescription());
			ad.setPrice(updatedAdvertisement.getPrice());
			ad.setStatus(updatedAdvertisement.getStatus());
			ad.setUser(updatedAdvertisement.getUser());
			ad.setCategory(updatedAdvertisement.getCategory());
			return advertisementRepository.save(ad);
		}).orElseThrow(() -> new RuntimeException("Advertisement not found"));
	}

	@Override
	public void deleteAdvertisement(Long id) {
		advertisementRepository.deleteById(id);
	}

	@Override
	public AdvertisementResponse getAllData(Long advertisementId, Long categoryId, Long userId) {
	    // Fetch advertisement by ID
	    Advertisement advertisementObj = advertisementRepository.findById(advertisementId)
	            .orElseThrow(() -> new RuntimeException("Advertisement not found with ID: " + advertisementId));
	    
	    // Map Advertisement to AdvertisementResponse
	    AdvertisementResponse advertisementResponse = new AdvertisementResponse();
	    advertisementResponse.setAdvertisementId(advertisementObj.getId());
	    advertisementResponse.setTitle(advertisementObj.getTitle());
	    advertisementResponse.setDescription(advertisementObj.getDescription());
	    advertisementResponse.setStatus(advertisementObj.getStatus());
	    advertisementResponse.setPrice(advertisementObj.getPrice());

	    // Fetch Category by ID
	    Category categoryObj = categoryRepository.findById(categoryId)
	            .orElseThrow(() -> new RuntimeException("Category not found with ID: " + categoryId));
	    
	    // Map Category to CategoryResponse
	    CategoryResponse categoryResponse = new CategoryResponse();
	    categoryResponse.setCategoryId(categoryObj.getCategoryId());
	    categoryResponse.setCategoryName(categoryObj.getCategoryName());
	    categoryResponse.setDescription(categoryObj.getDescription());

	    // Fetch User by ID
	    User userObj = userRepository.findById(userId)
	            .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
	    
	    // Map User to UserResponse
	    UserResponse userResponse = new UserResponse();
	    userResponse.setUserId(userObj.getUserId());
	    userResponse.setUsername(userObj.getUsername());
	    
	    return advertisementResponse;
	}
}
	 
	    
	    
	    // Combine the responses into the DTO
//	    AdvertisementCategoryUserDTO advertisementCategoryUserDTO = new AdvertisementCategoryUserDTO();
//	    advertisementCategoryUserDTO.setAdvertisement(advertisementResponse);
//	    advertisementCategoryUserDTO.setCategory(categoryResponse);
//	    advertisementCategoryUserDTO.setUser(userResponse);
//	    
//	    return advertisementCategoryUserDTO;
//	}

