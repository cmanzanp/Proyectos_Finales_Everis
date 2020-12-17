package com.everis.taskmanager.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.taskmanager.model.EverisTask;
import com.everis.taskmanager.model.EverisUser;
import com.everis.taskmanager.repository.EverisTaskRepository;
import com.everis.taskmanager.repository.EverisUserRepository;
import com.everis.taskmanager.services.EverisUserService;

@Service
public class EverisUserServiceImpl implements EverisUserService{
	@Autowired
	private EverisUserRepository userRepository;
	
	@Autowired
	private EverisTaskRepository taskRepository;
	
	@Override
	public EverisUser createUser(EverisUser user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public List<EverisUser> getUsers() {
		return (List<EverisUser>)userRepository.findAll();
	}

	@Override
	public EverisUser getUserById(Integer id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<EverisUser> deleteUserById(Integer id) {
		userRepository.deleteById(id);
		return getUsers();
	}

	@Override
	public EverisUser updateUserById(EverisUser u, Integer id) {
		EverisUser u1 = userRepository.findById(id).get();
		if(u.getUserName()!=null && u.getUserName().compareTo("")!=0) {
			u1.setUserName(u.getUserName());
		}
		if(u.getUserSurname()!=null && u.getUserSurname().compareTo("")!=0) {
			u1.setUserSurname(u.getUserSurname());
		}
		userRepository.save(u1);
		return u1;
	}

	@Override
	public EverisUser addTaskById(Integer idu, Integer idt) {
		EverisUser u1 = userRepository.findById(idu).get();
		EverisTask t1 = taskRepository.findById(idt).get();
		u1.addTask(t1);
		userRepository.save(u1);
		return u1;
	}
}
