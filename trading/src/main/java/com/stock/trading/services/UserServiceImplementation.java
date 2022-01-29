package com.stock.trading.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.trading.dao.UserDao;
import com.stock.trading.entities.User;

@Service
public class UserServiceImplementation implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getUsers() {
		
		return userDao.findAll();
	}

	@Override
	public User addUser(User user) {
		
		userDao.save(user);
		return user;
	}

	


}
