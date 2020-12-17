package com.everis.streetfullstacker.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Clase "Controlador" que controla el manejo de excepciones
 * 
 * @author Ángel //TODO
 * @since 16-12-20
 */
@ControllerAdvice
public class AdviceController {
	
	/**
	 * Capta cualquier excepción en los métodos de cualquier controlador.
	 * 
	 * @return @ResponseBody String
	 */
	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest req, Exception e, Model model) {

		// Respuesta.
		model.addAttribute("errorMsg", e.getMessage());

		return "error";
	}

}
