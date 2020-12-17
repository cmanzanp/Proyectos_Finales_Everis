package com.everis.taskmanager.repository;

import org.springframework.stereotype.Repository;

import com.everis.taskmanager.model.EverisProject;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EverisProjectRepository extends CrudRepository <EverisProject, Integer>{

}
