package co.in.firstproject.service;

import java.util.List;
import java.util.Optional;

import co.in.firstproject.dtoo.AdvertisementResponse;
import co.in.firstproject.entity.Advertisement;

public interface IAdvertisementService {
	
	List<Advertisement> getAllAdvertisements();
	Optional<Advertisement> getAdvertisementById(Long id);
	Advertisement createAdvertisement(Advertisement advertisement, Long userId, Long categoryId);
	Advertisement updateAdvertisement(Long id, Advertisement updatedAdvertisement);
	void deleteAdvertisement(Long id);
	AdvertisementResponse getAllData(Long advertisementId, Long categoryId, Long userId);
}


