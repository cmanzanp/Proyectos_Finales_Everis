package com.everis.tattoo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.tattoo.model.entity.Product;

@Repository
public interface ProductRepositoryI extends JpaRepository<Product, Long> {

}
