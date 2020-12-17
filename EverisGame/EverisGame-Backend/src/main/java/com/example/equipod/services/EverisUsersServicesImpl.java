package com.example.equipod.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.equipod.persistence.EverisUser;
import com.example.equipod.persistence.EverisUserI;

@Service
public class EverisUsersServicesImpl implements EverisUsersServicesI{
	
	@Autowired
	private EverisUserI userRepository;
	
	@Override
	public void AddUsers(EverisUser user) {
		
		userRepository.save(user);
	}

	@Override
	public void removeUsers(EverisUser user) {
		
		userRepository.delete(user);
	}

	@Override
	public void updateUsers(EverisUser user) {
		
		userRepository.save(user);
	}

	@Override
	public EverisUser findByUserName(String username){
		
		return userRepository.findByUserName(username);
	}
	
	@Override
	public List<EverisUser> findAll(){
		
		return userRepository.findAll();
	}

}
