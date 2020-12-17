package com.example.equipod.rest;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.equipod.persistence.EverisUser;
import com.example.equipod.services.EverisUsersServicesI;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/equipod")
public class UserController {

	@Autowired
	private EverisUsersServicesI userService;
	
	@GetMapping("/user")
	public List<EverisUser> getUsers(){
		return userService.findAll();
	}
	
	@PostMapping("/user")
	public void createUser( @RequestBody EverisUser user) {
		
		userService.AddUsers(user);
		
	}
}
