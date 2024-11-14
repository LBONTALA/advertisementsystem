package co.in.firstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.in.firstproject.dtoo.AdvertisementResponse;
import co.in.firstproject.entity.Advertisement;
import co.in.firstproject.service.IAdvertisementService;

@RestController
@RequestMapping("/api/advertisements")
public class AdvertisementController {
	@Autowired
	private IAdvertisementService advertisementService;

	@GetMapping("/getall")
	public List<Advertisement> getAllAdvertisements() {
		return advertisementService.getAllAdvertisements();
	}

	@GetMapping("/{id}")
	public Advertisement getAdvertisementById(@PathVariable Long id) {
		return advertisementService.getAdvertisementById(id)
				.orElseThrow(() -> new RuntimeException("Advertisement not found"));
	}

	@PostMapping("/{user_id}/{category_id}")
	public Advertisement createAdvertisement(@RequestBody Advertisement advertisement,
			@PathVariable("user_id") Long userId, @PathVariable("category_id") Long categoryId) {
		{
			return advertisementService.createAdvertisement(advertisement, userId, categoryId);
		}
	}

	@PutMapping("/{id}")
	public Advertisement updateAdvertisement(@PathVariable Long id, @RequestBody Advertisement advertisement) {
		return advertisementService.updateAdvertisement(id, advertisement);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteAdvertisement(@PathVariable Long id) {
		try {
			advertisementService.deleteAdvertisement(id);
			return ResponseEntity.ok("Advertisement deleted successfully.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete advertisement.");
		}

	}

	@GetMapping("/{advertisementId}/{categoryId}/{userId}")
	public ResponseEntity<AdvertisementResponse> getAllData(@PathVariable Long advertisementId , @PathVariable Long userId , @PathVariable Long categoryId ) {
		AdvertisementResponse data = advertisementService.getAllData(advertisementId,categoryId, userId);
		return ResponseEntity.ok(data);
	}
 
}
