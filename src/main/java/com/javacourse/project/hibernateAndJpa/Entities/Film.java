package com.javacourse.project.hibernateAndJpa.Entities;

import jakarta.persistence.*;

@Entity
@Table(name="film")

public class Film {
	@Id
	@Column(name="film_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int film_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="length")
	private int length;
	
	@Column(name="language_id")
	private int language_id;

	public Film(int film_id, String title, String description, int length, int language_id) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
		this.length = length;
		this.language_id = language_id;
	}
	
	public Film() {}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}
	
	
}
