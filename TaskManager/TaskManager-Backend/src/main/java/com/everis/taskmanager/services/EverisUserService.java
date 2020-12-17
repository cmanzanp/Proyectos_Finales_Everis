package com.everis.taskmanager.services;

import java.util.List;

import com.everis.taskmanager.model.EverisUser;

public interface EverisUserService {
	public EverisUser createUser(EverisUser user);
	
	public List<EverisUser> getUsers();
	
	public EverisUser getUserById(Integer id);
	
	public List<EverisUser> deleteUserById(Integer id);
	
	public EverisUser updateUserById(EverisUser u, Integer id);
	
	public EverisUser addTaskById(Integer idu, Integer idt);
}
