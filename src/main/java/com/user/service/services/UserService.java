package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserService {
	
	//create
	User saveUser(User user);
	
	//get all user
	List<User> getAlluser();
	
	//get single user by user id
	User getUser(String userId);
	
	//delete
	
	//update
}
