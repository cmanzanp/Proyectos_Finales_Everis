package com.everis.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.taskmanager.model.EverisUser;
import com.everis.taskmanager.services.EverisUserService;


@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class EverisUserController {
	@Autowired
	private EverisUserService userService;
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody EverisUser u) {
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(u));
	}
	
	@GetMapping
	public ResponseEntity<?> getUsers(){
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUserById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.deleteUserById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUserById(@RequestBody EverisUser u, @PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(userService.updateUserById(u, id));
	}
	
	@GetMapping("/task/{idu}&&{idt}")
	public ResponseEntity<?> addTaskById(@PathVariable("idu") Integer idu, @PathVariable("idt") Integer idt){
		
		return ResponseEntity.status(HttpStatus.OK).body(userService.addTaskById(idu, idt));
	}

}
