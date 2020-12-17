package com.example.equipod.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.equipod.persistence.EverisGame;
import com.example.equipod.services.EverisGameServicesI;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/equipod")
public class GameController {

	@Autowired
	private EverisGameServicesI gameServices;
	
	@GetMapping("/games")
	public List<EverisGame> allGames(){
		
		return gameServices.findAll();
	}
	
	@GetMapping("/games/{title}")
	public EverisGame findGame(@PathVariable String title) {
		
		return gameServices.findByTitle(title);
	}
	
	@GetMapping("/games/filtered/g{genre}")
	public List<EverisGame> findByGenre(@PathVariable String genre){
		
		return gameServices.findByGenre(genre);
	}
	
	@GetMapping("/games/filtered/p{platform}")
	public List<EverisGame> findByPlatform(@PathVariable String platform){
		
		return gameServices.findByPlatform(platform);
	}
}
