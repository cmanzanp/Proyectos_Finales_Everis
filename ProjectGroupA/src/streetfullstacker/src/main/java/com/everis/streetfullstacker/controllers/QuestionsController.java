package com.everis.streetfullstacker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.everis.streetfullstacker.repository.Question;
import com.everis.streetfullstacker.services.QuestionManagementServiceI;

/**
 * Clase "Controlador" que controla las peticiones relativas a la gestión de
 * preguntas
 * 
 * @author Ana Blanco Escudero
 * @since 16-12-20
 */
@Controller
public class QuestionsController {

	/** Servicio de consultas y gestión de preguntas */
	@Autowired
	private QuestionManagementServiceI questionService;
	private String result;

	/**
	 * Generar el listado de todas las preguntas.
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/showQuestionsView")
	public String showQuestions(Model model) {

		// Obtención del listado de preguntas de la BBDD.
		final List<Question> questionsList = questionService.getAllQuestions();

		// Carga de datos al modelo.
		model.addAttribute("questionsListView", questionsList);

		return "showQuestions";
	}
	
//
//	@PostMapping("/actSubmitAnswer")
//	public String submitAnswersForm(@RequestParam String name, Model model)
//			throws Exception {
//
//		// Obtención del listado de preguntas de la BBDD.
//		final List<Question> questionsList = questionService.getAllQuestions();
//		
//		int countBack = 0;
//		int countFront = 0;
//
//		// Comprobación de si la respuesta es correcta o no y conteo
//		String resultText = "";
//		
//		// Carga de datos al modelo.
//		model.addAttribute("result", resultText);
//
//		return "redirect:showResultView";
//	}
	
//	/**
//	 * Mostrar el resultado del Test.
//	 * 
//	 * @param model
//	 * @return String
//	 */
//	@GetMapping("/showResultView")
//	public String showResult(Model model) {
//
//		// Obtención del resultado del text por parámetros de la petición
//		switch ((String) model.getAttribute(result)) {
//		case "BACK":
//			// Carga de datos al modelo
//			model.addAttribute("resultMessage", "¡Enhorabuena! Eres BACK de pata negra ;)");
//			break;
//		case "FRONT":
//			// Carga de datos al modelo
//			model.addAttribute("resultMessage", "¡Felicidades! Eres FRONT digno de Cai, Cai ;)");
//			break;
//		default:
//			// Carga de datos al modelo
//			model.addAttribute("resultMessage", "¡Empate! Tendré que decidir qué hacer contigo... ;)");
//			break;
//		}
//
//		return "showResult";
//	}
	
	/**
	 * Mostrar el resultado del Test.
	 * 
	 * @param model
	 * @return String
	 */
	@GetMapping("/showResultView")
	public String showResult(Model model) { // ALTERNATIVA AL MÉTODO ANTERIOR 

		// Obtención del resultado del text por parámetros de la petición
		switch ("BACK") { // ENTRADA DE PRUEBA
		case "BACK":
			// Carga de datos al modelo
			model.addAttribute("resultMessage", "¡Enhorabuena! Eres BACK de pata negra ;)");
			break;
		case "FRONT":
			// Carga de datos al modelo
			model.addAttribute("resultMessage", "¡Felicidades! Eres FRONT digno de Cai, Cai ;)");
			break;
		default:
			// Carga de datos al modelo
			model.addAttribute("resultMessage", "¡Empate! Tendré que decidir qué hacer contigo... ;)");
			break;
		}

		return "showResult";
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
}
