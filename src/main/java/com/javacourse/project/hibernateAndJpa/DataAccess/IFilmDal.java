package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;
import com.javacourse.project.hibernateAndJpa.Entities.Film;

public interface IFilmDal {
	List<Film> getAll();
	void add(Film film); 
	void update(Film film);
	void delete(Film film); 
	Film getById(int id);
}
