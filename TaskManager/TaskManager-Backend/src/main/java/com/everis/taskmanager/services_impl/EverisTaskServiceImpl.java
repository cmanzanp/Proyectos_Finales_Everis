package com.everis.taskmanager.services_impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.taskmanager.model.EverisTask;
import com.everis.taskmanager.model.EverisUser;
import com.everis.taskmanager.repository.EverisTaskRepository;
import com.everis.taskmanager.repository.EverisUserRepository;
import com.everis.taskmanager.services.EverisTaskService;

@Service
public class EverisTaskServiceImpl implements EverisTaskService{
	@Autowired
	private EverisTaskRepository taskRepository;
	
	@Autowired
	private EverisUserRepository userRepository;
	
	@Override
	public EverisTask createTask(EverisTask task) {
		taskRepository.save(task);
		return task;
	}

	@Override
	public List<EverisTask> getTasks() {
		return (List<EverisTask>)taskRepository.findAll();
	}

	@Override
	public EverisTask getTaskById(Integer id) {
		return taskRepository.findById(id).get();
	}

	@Override
	public List<EverisTask> deleteTaskById(Integer id) {
		
		EverisTask taskToDelete = taskRepository.findById(id).get();
		
		List<EverisUser> users = (List<EverisUser>)userRepository.findAll();
		
		for(EverisUser u : users) {
			if(u.getTasks().contains(taskToDelete)) {
				u.getTasks().remove(taskToDelete);
				userRepository.save(u);
			}
		}
		return getTasks();
	}

	@Override
	public EverisTask updateTaskById(EverisTask t, Integer id) {
		EverisTask t1 = taskRepository.findById(id).get();
		if(t.getTaskName()!=null && t.getTaskName().compareTo("")!=0) {
			t1.setTaskName(t.getTaskName());
		}
		if(t.getTaskDescription()!=null && t.getTaskDescription().compareTo("")!=0) {
			t1.setTaskDescription(t.getTaskDescription());
		}
		taskRepository.save(t1);
		return t1;
	}
}
