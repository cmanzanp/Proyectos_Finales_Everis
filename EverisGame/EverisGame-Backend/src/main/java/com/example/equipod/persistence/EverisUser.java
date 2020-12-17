package com.example.equipod.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class EverisUser {
	
	/** Identificador del ususario */
	private long id;
	
	/** Correo del usuario */
	private String mail;
	
	/** Contraseña del ususario */
	private String pass;
	
	/** Nombre del ususario */
	private String userName;
	
	/** Plataforma favorita del ususario */
	private String platform;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the mail
	 */
	@Column(name = "MAIL", nullable = false, unique = true)
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the pass
	 */
	@Column(name = "PASS", nullable = false, unique = false)
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

	/**
	 * @return the userName
	 */
	@Column(name = "USERNAME", nullable = false, unique = true)
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the platform
	 */
	@Column(name = "PLATFORM", nullable = true, unique = false)
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	
	
}
