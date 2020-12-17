package com.everis.tattoo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.tattoo.model.entity.Product;
import com.everis.tattoo.model.repository.ProductRepositoryI;
import com.everis.tattoo.service.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI {

	/** Instancia del repostorio ed producto */
	@Autowired
	private ProductRepositoryI productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(final Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product addProduct(final Product sentProduct) {
		return productRepository.save(sentProduct);
	}

	@Override
	public Product deleteProductById(final Long id) {
		Product product = productRepository.findById(id).get();
		productRepository.deleteById(id);
		return product;
	}

}
