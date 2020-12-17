package com.everis.streetfullstacker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.everis.streetfullstacker.repository.Question;
import com.everis.streetfullstacker.services.QuestionManagementServiceI;

/**
 * Clase "Aplicación Spring Boot" que consume servicios de gestión de preguntas
 * 
 * @author Abraham //TODO
 * @since 15-12-20
 */
@SpringBootApplication
public class StreetfullstackerApplication implements CommandLineRunner{
	
	/** Servicio de consultas y gestión de preguntas */
	@Autowired
	private QuestionManagementServiceI questionService;

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(StreetfullstackerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		// Creación de 10 preguntas e inserción de las mismos en la base de datos
				System.out.println("****************** INSERT QUESTIONS ******************");
				Question question1 = new Question();
				question1.setDevType("BACK");
				question1.setQuestionAsk("¿Es spring boot un framework web java?");
				question1.setAnswerRight(true);
				questionService.addQuestion(question1);

				Question question2 = new Question();
				question2.setDevType("FRONT");
				question2.setQuestionAsk("¿Se puede implementar lazy routing a Angular?");
				question2.setAnswerRight(true);
				questionService.addQuestion(question2);

				Question question3 = new Question();
				question3.setDevType("BACK");
				question3.setQuestionAsk("¿El back es lo contrario de lo que pertenece Luis?");
				question3.setAnswerRight(false);
				questionService.addQuestion(question3);

				Question question4 = new Question();
				question4.setDevType("FRONT");
				question4.setQuestionAsk("Si Tellez es de Back-End,¿Crees que algún día le dará una oportunidad al Front-End?");
				question4.setAnswerRight(true);
				questionService.addQuestion(question4);
				
				Question question5 = new Question();
				question5.setDevType("BACK");
				question5.setQuestionAsk("¿El patrón repository necesita de la etiqueta @Service?");
				question5.setAnswerRight(false);
				questionService.addQuestion(question5);

				Question question6 = new Question();
				question6.setDevType("FRONT");
				question6.setQuestionAsk("¿Existe la superclass en Javascript?");
				question6.setAnswerRight(true);
				questionService.addQuestion(question6);

				Question question7 = new Question();
				question7.setDevType("BACK");
				question7.setQuestionAsk("¿Es mejor el Back que el Front? ");
				question7.setAnswerRight(false);
				questionService.addQuestion(question7);

				Question question8 = new Question();
				question8.setDevType("FRONT");
				question8.setQuestionAsk("Con el console.table()¿ muestra la línea que desea por consola?");
				question8.setAnswerRight(false);
				questionService.addQuestion(question8);
				
				Question question9 = new Question();
				question9.setDevType("BACK");
				question9.setQuestionAsk("La etiqueta @RestController ¿Sirve para tener una Api Rest?");
				question9.setAnswerRight(true);
				questionService.addQuestion(question9);

				Question question10 = new Question();
				question10.setDevType("FRONT");
				question10.setQuestionAsk("El comando ng g m components/holaMundo ¿Genera un elemento components en Angular?");
				question10.setAnswerRight(false);
				questionService.addQuestion(question10);
				System.out.println("*****************************************************");
		
	}

}
