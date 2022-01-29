package com.stock.trading.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.stock.trading.entities.User;
import com.stock.trading.services.UserService;

@RestController
public class UserController {

	
	@Autowired
	private UserService userService;

	
	
	// get all user details
	
	@GetMapping("/users")
	public List<User> getUser()
	{
		return this.userService.getUsers();
	}
	
	// add the users into the database
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user)
	{
		return this.userService.addUser(user);
	}
	

}
