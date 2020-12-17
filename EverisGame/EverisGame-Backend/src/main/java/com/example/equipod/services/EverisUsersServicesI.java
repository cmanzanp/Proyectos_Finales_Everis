package com.example.equipod.services;

import java.util.List;

import com.example.equipod.persistence.EverisUser;

public interface EverisUsersServicesI {
	/**
	*
	*Metodo para añadir usuario
	*
	*/
	public void AddUsers(final EverisUser user);
	
	/**
	 * Metodo para eliminar usuario
	 */
	public void removeUsers(final EverisUser user);
	
	/**
	 * Metodo para actualizar usuario
	 */
	public void updateUsers(final EverisUser user);
	
	/**
	 * Metodo para obtener usuario según ID
	 */
	public EverisUser findByUserName(String username);
	
	/**
	 * Devuelve todos los usuarios
	 * @return
	 */
	public List<EverisUser> findAll();
	
}
