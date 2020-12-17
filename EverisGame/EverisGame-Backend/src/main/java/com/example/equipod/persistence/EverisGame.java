package com.example.equipod.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GAME")
public class EverisGame {

	/** IDENTIFICADOR DEL JUEGO */
	private long id;
	
	/** TITULO DEL JUEGO */
	private String title;
	
	/** DESCRIPCION DEL JUEGO */
	private String description;
	
	/** PLATAFORMA EN LA QUE SE PUEDE JUGAR */
	private String platform;
	
	/** GENERO DEL JUEGO */
	private String genre;
	
	/** VALORACION DEL JUEGO */
	private int rate;

	/** IMAGEN DEL JUEGO */
    private String UrlImage;

	
	
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
	 * @return the title
	 */
	@Column(name = "TITLE", nullable = false, unique = true)
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the description
	 */
	@Column(name = "DESCRIPTION", nullable = false, unique = false)
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the platform
	 */
	@Column(name = "PLATFORM", nullable = false, unique = false)
	public String getPlatform() {
		return platform;
	}

	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * @return the genre
	 */
	@Column(name = "GENRE", nullable = false, unique = false)
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the rate
	 */
	@Column(name = "RATE", nullable = false, unique = false)
	public int getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}
	
    /**
     * @return the urlImage
     */
    @Column(name = "IMAGE", nullable = false, unique = true)
    public String getUrlImage() {
        return UrlImage;
    }

    /**
     * @param urlImage the urlImage to set
     */
    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }
	
	
}
