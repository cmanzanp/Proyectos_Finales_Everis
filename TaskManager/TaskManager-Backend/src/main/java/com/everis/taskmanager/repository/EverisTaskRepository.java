package com.everis.taskmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.taskmanager.model.EverisTask;

@Repository
public interface EverisTaskRepository  extends CrudRepository <EverisTask, Integer>{

}
