package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.entities.User;

public class UserManager {
	// 3. initiate instance
	private static UserManager instance = new UserManager();

	// create a singleton
	// 1. make private constructor to ban creating instance
	private UserManager() {
	}

	// 2. create getInstance method
	// - public to invoke from anywhere
	// - static to invoke getInstance with no instance
	public static UserManager getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(userType);

		return user;
	}
}
