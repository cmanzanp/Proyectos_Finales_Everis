package com.everis.streetfullstacker.services;

import java.util.List;
import com.everis.streetfullstacker.repository.Question;

/**
 * Interfaz "Servicio" de consultas y gestión de preguntas
 * 
 * @author Paco //TODO
 * @since 16-12-20
 */
public interface QuestionManagementServiceI {

	/**
	 * Devuelve una lista de preguntas con sus respuestas
	 * 
	 * @return List<Questions>
	 */
	public List<Question> getAllQuestions();
	
	/**
	 * Añade una pregunta
	 * 
	 * @param q
	 */
	public void addQuestion(final Question q);
	
	/**
	 * Actualiza una pregunta
	 * 
	 * @param q
	 */
	public void updateQuestion(final Question q);
	
	/**
	 * Elimina una pregunta
	 * 
	 * @param q
	 */
	public void eraseQuestion(final Long questionId);
}
