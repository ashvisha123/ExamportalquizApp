package com.main.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.main.helper.UserNotFoundException;
import com.main.model.Role;
import com.main.model.User;
import com.main.model.UserRole;
import com.main.service.UserService;



@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

	@Autowired
	private UserService userService;

	//creating user
	@PostMapping("/") 
	public User createUser(@RequestBody User user) throws Exception {
		
		Set<UserRole> roles=new HashSet<>();
		
		
		Role role=new Role();
		role.setRoleId(45L);
		role.setRoleName("NORMAL");
		
		
		UserRole userRole=new UserRole();
		userRole.setUser(user);
		userRole.setRole(role);
		
		roles.add(userRole);
		
		return this.userService.createUser(user, roles);
	}
	
	//get user by username
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userService.getUser(username);
	}
	
	//delete user by Id
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId){
		this.userService.deleteUser(userId);
	}
	
	//update api
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<?> exceptionHandler(UserNotFoundException ex) {
		return ResponseEntity.ok(ex.getMessage());
	}
	
	
}
