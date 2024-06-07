package com.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.service.services.external.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	RatingService ratingService;
	
//	@Test
//	void createRating() {
//		Rating rating = Rating.builder().ratings(10).userId("1183a0f2-3310-4058-bc5b-551ff81113a8").hotelId("1d594c25-1456-43f1-8b98-d94ed6e85244").feedback("Amazing Restra").build();
//		Rating savedRating = ratingService.createRating(rating);
//		
//		System.out.println("Rating Created");
//	}
	

}
