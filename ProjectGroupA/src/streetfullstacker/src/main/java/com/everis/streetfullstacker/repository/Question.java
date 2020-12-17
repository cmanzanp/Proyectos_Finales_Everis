package com.everis.streetfullstacker.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Clase "Entidad" ORM que representa a una pregunta en la tabla pregunta de la
 * base de datos
 * 
 * @author Ángel //TODO
 * @since 16-12-20
 */
@Entity
@Table(name = "t_question")
public class Question implements Serializable {

	// ATRIBUTOS:	
	/** SERIAL **/
	private static final long serialVersionUID = 1L;

	/** Question ID **/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	/** Tipo de desarrollo al que pertenece (BACK/FRONT) **/
	@Column(name = "c_dev_type")
	private String devType;

	/** Texto de la pregunta **/
	@Column(name = "c_question_ask")
	private String questionAsk;

	/** Respuesta correcta **/
	@Column(name = "c_answer_right")
	private boolean answerRight;
	
//	/** Respuesta elegida **/
//	private boolean answerSelected;

	// GETTERS & SETTERS:
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}

	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	/**
	 * @return the devType
	 */
	public String getDevType() {
		return devType;
	}

	/**
	 * @param devType the devType to set
	 */
	public void setDevType(String devType) {
		this.devType = devType;
	}

	/**
	 * @return the questionAsk
	 */
	public String getQuestionAsk() {
		return questionAsk;
	}

	/**
	 * @param questionAsk the questionAsk to set
	 */
	public void setQuestionAsk(String questionAsk) {
		this.questionAsk = questionAsk;
	}

	/**
	 * @return the answerRight
	 */
	public boolean isAnswerRight() {
		return answerRight;
	}

	/**
	 * @param answerRight the answerRight to set
	 */
	public void setAnswerRight(boolean answerRight) {
		this.answerRight = answerRight;
	}

	// TOSTRING:
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", devType=" + devType + ", questionAsk=" + questionAsk
				+ ", answerRight=" + answerRight + "]";
	}

}