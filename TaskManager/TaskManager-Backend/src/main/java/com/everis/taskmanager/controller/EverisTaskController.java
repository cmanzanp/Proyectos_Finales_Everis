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

import com.everis.taskmanager.model.EverisTask;
import com.everis.taskmanager.services.EverisTaskService;

@RestController
@RequestMapping(path = "/tasks")
@CrossOrigin(origins = "*")
public class EverisTaskController {
	@Autowired
	private EverisTaskService taskService;
	
	@PostMapping
	public ResponseEntity<?> createTask(@RequestBody EverisTask t) {
		return ResponseEntity.status(HttpStatus.CREATED).body(taskService.createTask(t));
	}
	
	@GetMapping
	public ResponseEntity<?> getTasks(){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.getTasks());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTaskById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.getTaskById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTaskById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.deleteTaskById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTaskById(@RequestBody EverisTask t, @PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(taskService.updateTaskById(t, id));
	}
}
