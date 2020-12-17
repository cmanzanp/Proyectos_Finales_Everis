package com.everis.taskmanager.services;

import java.util.List;

import com.everis.taskmanager.model.EverisTask;


public interface EverisTaskService {
	public EverisTask createTask(EverisTask task);
	
	public List<EverisTask> getTasks();
	
	public EverisTask getTaskById(Integer id);
	
	public List<EverisTask> deleteTaskById(Integer id);
	
	public EverisTask updateTaskById(EverisTask t, Integer id);
}
