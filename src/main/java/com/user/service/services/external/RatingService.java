package com.user.service.services.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.user.service.entities.Rating;

@Service
@FeignClient(name="RATING-SERVICE")
public interface RatingService {
	
	//POST
	@PostMapping("/ratings")
	Rating createRating(Rating values);
	
	
	//PUT
	@PutMapping("/ratings/{ratingId}")
	Rating updateRating(@PathVariable String ratingId, Rating rating);
	
	//DELETE
	@DeleteMapping("/ratings/{ratingId}")
	void deleteRating(@PathVariable String ratingId);
}
