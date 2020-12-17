package com.everis.taskmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.everis.taskmanager.model.EverisUser;

@Repository
public interface EverisUserRepository  extends CrudRepository <EverisUser, Integer>{

}
