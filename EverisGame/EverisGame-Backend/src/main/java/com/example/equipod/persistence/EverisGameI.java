package com.example.equipod.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EverisGameI extends JpaRepository<EverisGame, Long>{

	/**
	 * Devuelve un juego por su nombre
	 * @param title
	 * @return
	 */
	public EverisGame findByTitle(String title);
	
	/**
	 * Devuelve los juegos de un mismo genero
	 * @param genre
	 * @return
	 */
	public List<EverisGame> findByGenre(String genre);
	
	/**
	 * Devuelve una lista de juegos de una plataforma
	 * @param platform
	 * @return
	 */
	public List<EverisGame> findByPlatform(String platform);
}
