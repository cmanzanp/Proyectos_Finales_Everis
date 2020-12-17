package com.everis.tattoo.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "CLIENT_T")
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String telephone;
	
	private String dni;
	
	private String address;
	
	private List<Product> products = new ArrayList<Product>();
	
	public Client() {}

	/* ID del cliente */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	/* Nombre del cliente */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	/* Telefono del cliente */
	@Column(name = "TELEPHONE")
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	/* DNI del cliente */
	@Column(name = "DNI", nullable = false, length = 9)
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

	
	/* Direccion del cliente */
	@Column(name = "ADDRESS", nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	@JsonIgnore
	@Column(name = "PRODUCTS")
	@ManyToMany(cascade = {CascadeType.ALL},mappedBy="clients")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
