package com.example.equipod.services;

import java.util.List;

import com.example.equipod.persistence.EverisGame;

public interface EverisGameServicesI {
	
	/**
	 * Metodo para añadir un juego
	 */
	
	public void AddGame(final EverisGame game);
	
	/**
	 * Metodo para eliminar un jeugo
	 */
	
	public void removeGame(final EverisGame game);
	
	/**
	 * Metodo para actualizar un juego
	 */
	
	public void updateGame(final EverisGame game);
	
	/**
	 * Metodo para encontra un jeugo por titulo
	 */
	
	public EverisGame findByTitle(final String title);
	
	/**
	 * Encuentra todos los juegos
	 * @return
	 */
	public List<EverisGame> findAll();
	
	/**
	 * Encuentra juegos por genero
	 * @param genre
	 * @return
	 */
	public List<EverisGame> findByGenre(String genre);
	
	/**
	 * Encuentra juegos por plataaforma
	 * @param platform
	 * @return
	 */
	public List<EverisGame> findByPlatform(String platform);
}
