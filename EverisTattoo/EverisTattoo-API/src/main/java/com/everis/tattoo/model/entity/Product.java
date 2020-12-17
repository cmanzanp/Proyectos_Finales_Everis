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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_T")
public class Product implements Serializable {

	/* Serial */
	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;

	private String category;

	private String description;

	private Double price;

	private String img;
	
	private List<Client> clients = new ArrayList<Client>();

	public Product() {
		this.description = new String();
		this.img = new String();
	}

	/* PK */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PRODUCT")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	/* Nombre del producto */
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	/* Categoria del producto */
	@Column(name = "CATEGORY", nullable = false)
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	/* Descripcion del producto */
	@Column(name = "DESCRIPTION")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	/* Precio del producto */
	@Column(name = "PRICE", nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	
	/* Imagen del producto */
	@Column(name = "IMG")
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}

	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="PRODUCT_CLIENT", joinColumns={@JoinColumn(name="ID_PRODUCT")}, inverseJoinColumns={@JoinColumn(name="ID_CLIENT")})
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
