package com.company.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	static List<User> users;
	
	static {
		users = new ArrayList<User>();
		users.add(new User("Nikith", "Ben"));
		users.add(new User("Vivek", "Ben"));
		users.add(new User("Karteek", "Hyd"));
		users.add(new User("Srinidhi", "Hyd"));
		users.add(new User("Pawan", "Che"));
	}
	
	public boolean validateUser(User user) {
		System.out.println(user);
		return user.getUsername().equals("Kumar");
	}
	
	public List<User> getUsers() {
		return users;
	}
}
