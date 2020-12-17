package com.everis.tattoo.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.tattoo.model.entity.Product;
import com.everis.tattoo.service.ProductServiceI;

@RestController
@RequestMapping(path = "/everis/tattoo")
@CrossOrigin(origins = "*")
public class ProductController {

	@Autowired
	private ProductServiceI productService;

	/* Obtiene los productos */
	@GetMapping
	public ResponseEntity<?> getAllProducts() {
		
		return !productService.getAllProducts().isEmpty()
				? ResponseEntity.ok(productService.getAllProducts())
				: ResponseEntity.notFound().build();
	}

	/* Obtiene un producto */
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getProduct(@PathVariable Long id) {
		
		try {
			return ResponseEntity.ok(productService.getProduct(id));
		} catch (NoSuchElementException e) {
			return ResponseEntity.notFound().build();
		}
	}

	/* Añade un producto */	
	@PostMapping
	public ResponseEntity<?> addProduct(@RequestBody Product sentProduct) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(sentProduct)); 
	}
	
	/* Borra un producto */
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id) {
		
		try {
			return ResponseEntity.ok(productService.deleteProductById(id)) ;
		} catch (NoSuchElementException e) {
			return ResponseEntity.notFound().build();
		}
	}
}
