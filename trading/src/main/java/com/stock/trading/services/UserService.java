package com.stock.trading.services;

import java.util.List;
import com.stock.trading.entities.User;

public interface UserService {

	public List<User> getUsers();

	public User addUser(User user);


	

}
