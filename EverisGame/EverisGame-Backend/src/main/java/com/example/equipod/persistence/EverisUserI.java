package com.example.equipod.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EverisUserI extends JpaRepository<EverisUser, Long>{
	
	/**
	 * Devuelve un usuario segun su nombre
	 * @param username
	 * @return
	 */
	public EverisUser findByUserName(String username);

}
