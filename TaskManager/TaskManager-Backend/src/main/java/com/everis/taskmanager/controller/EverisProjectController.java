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

import com.everis.taskmanager.model.EverisProject;
import com.everis.taskmanager.services.EverisProjectService;


@RestController
@RequestMapping(path = "/projects")
@CrossOrigin(origins = "*")
public class EverisProjectController {
	@Autowired
	private EverisProjectService projectService;
	
	@PostMapping
	public ResponseEntity<?> createProject(@RequestBody EverisProject p) {
		return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(p));
	}
	
	@GetMapping
	public ResponseEntity<?> getProjects(){
		return ResponseEntity.status(HttpStatus.OK).body(projectService.getProjects());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProjectById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(projectService.getProjectById(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProjectById(@PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(projectService.deleteProjectById(id));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateProjectById(@RequestBody EverisProject p, @PathVariable("id") Integer id){
		return ResponseEntity.status(HttpStatus.OK).body(projectService.updateProjectById(p, id));
	}
	
	@GetMapping("/user/{idp}&&{idu}")
	public ResponseEntity<?> addUserById(@PathVariable("idp") Integer idp, @PathVariable("idu") Integer idu){
		return ResponseEntity.status(HttpStatus.OK).body(projectService.addUserById(idp, idu));
	}
	
	@DeleteMapping("/user/{idp}&&{idu}")
	public ResponseEntity<?>deleteUserFromProject(@PathVariable("idp") Integer idp, @PathVariable("idu") Integer idu){
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(projectService.deleteUserFromProject(idp,idu));
	}
	
}
