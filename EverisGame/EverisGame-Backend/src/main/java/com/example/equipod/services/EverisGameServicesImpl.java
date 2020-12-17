package com.example.equipod.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.equipod.persistence.EverisGame;
import com.example.equipod.persistence.EverisGameI;


@Service
public class EverisGameServicesImpl implements EverisGameServicesI{

	@Autowired
	private EverisGameI gameRepository;
	
	@Override
	public void AddGame(EverisGame game) {
		
		gameRepository.save(game);
	}

	@Override
	public void removeGame(EverisGame game) {
		
		gameRepository.delete(game);
	}

	@Override
	public void updateGame(EverisGame game) {
		
		gameRepository.save(game);
	}

	@Override
	public EverisGame findByTitle(String title) {
		
		return gameRepository.findByTitle(title);
	}

	@Override
	public List<EverisGame> findAll(){
		
		return gameRepository.findAll();
	}
	
	@Override
	public List<EverisGame> findByGenre(String genre){
		
		return gameRepository.findByGenre(genre);
	}
	
	@Override
	public List<EverisGame> findByPlatform(String platform){
		
		return gameRepository.findByPlatform(platform);
	}
}
