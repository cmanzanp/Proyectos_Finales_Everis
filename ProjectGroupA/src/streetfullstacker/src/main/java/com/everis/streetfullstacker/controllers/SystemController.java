package com.everis.streetfullstacker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Clase "Controlador" que controla las peticiones generales a la aplicación
 * 
 * @author Ángel //TODO
 * @since 16-12-20
 */
@Controller
@RequestMapping("*")
public class SystemController {
	
	/**
	 * Capta cualquier solicitud.
	 * 
	 * @return String
	 */
	@GetMapping
	public String showIndex() {
		return "index";
	}
	
	/**
	 * Redirecciona al controlador de preguntas.
	 * 
	 * @return String
	 */
	@GetMapping("/questionsView")
	public String redirectToShowQuestionsView() {
		return "redirect:showQuestionsView";
	}

//	/**
//	 * Redirecciona a la vista de los resultados.
//	 * 
//	 * @return String
//	 */
//	@GetMapping("/showResultView")
//	public String redirectToShowResultTemplate() {
//		return "showResult";
//	}
		
	
}
