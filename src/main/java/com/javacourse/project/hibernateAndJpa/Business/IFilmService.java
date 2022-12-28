package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Film;

public interface IFilmService {
	List<Film> getAll();
	void add(Film film); 
	void update(Film film);
	void delete(Film film); 
	Film getById(int id);
}
