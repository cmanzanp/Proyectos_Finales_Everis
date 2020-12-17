package com.everis.streetfullstacker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Clase "Repositorio" que extiende los métodos del JpaRepository de consultas y
 * gestión de preguntas
 * 
 * @author Paco //TODO
 * @since 16-12-20
 */
@Repository
public interface QuestionRepositoryI extends JpaRepository<Question, Long>  {

}
