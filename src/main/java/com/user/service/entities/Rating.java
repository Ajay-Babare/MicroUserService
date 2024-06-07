package com.user.service.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
	private String userId;
	private String ratingId;
	private String hotelId;
	private int ratings;
	private String feedback;
	private Hotel hotel;
}
