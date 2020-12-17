package com.everis.streetfullstacker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.streetfullstacker.repository.Question;
import com.everis.streetfullstacker.repository.QuestionRepositoryI;

/**
 * Clase "Servicio" de consultas y gestión de preguntas
 * 
 * @author Paco //TODO
 * @since 16-12-20
 */
@Service
public class QuestionManagementService implements QuestionManagementServiceI {

	/** Repo: Question*/
	@Autowired
	private QuestionRepositoryI Q;
	
	
	public List<Question> getAllQuestions() {
		return Q.findAll();
	}

	public void addQuestion(Question q) {
		Q.save(q);
		
	}

	public void updateQuestion(Question q) {
		Q.save(q);
		
	}

	public void eraseQuestion(Long questionId) {
		Q.deleteById(questionId);
		
	}

}
