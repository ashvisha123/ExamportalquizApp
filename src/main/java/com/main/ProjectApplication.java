package com.main;



import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.main.model.Role;
import com.main.model.User;
import com.main.model.UserRole;
import com.main.service.UserService;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

	@Autowired 
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		
		
//		 User user =new User();
//		 user.setFirstName("sri");
//		 user.setLastName("Latha");
//		 user.setUsername("SriLatha");
//		 user.setPassword("abc");
//		 user.setEmail("abc@gmail.com");
//		 user.setProfile("sri");
//		 
//		 Role role1=new Role();
//		 role1.setRoleId(41L);
//		 role1.setRoleName("ADMIN");
//		 
//		 Set<UserRole> userRoleSet=new HashSet<>();
//		 UserRole userRole=new UserRole();
//		 userRole.setRole(role1);
//		 userRole.setUser(user);
//		 
//		 userRoleSet.add(userRole);
//
//	     User user1=this.userService.createUser(user, userRoleSet);
//	     System.out.println(user1.getUsername());
	}

}
