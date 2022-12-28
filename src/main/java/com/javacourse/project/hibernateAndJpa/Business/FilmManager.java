package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IFilmDal;
import com.javacourse.project.hibernateAndJpa.Entities.Film;

@Service
public class FilmManager implements IFilmService{
	
	private IFilmDal filmDal;
	
	@Autowired
	public FilmManager(IFilmDal filmDal) {
		super();
		this.filmDal = filmDal;
	}

	@Override
	@Transactional
	public List<Film> getAll() {
		// TODO Auto-generated method stub
		return this.filmDal.getAll();
	}

	@Override
	@Transactional
	public void add(Film film) {
		// TODO Auto-generated method stub
		this.filmDal.add(film);
	}

	@Override
	@Transactional
	public void update(Film film) {
		// TODO Auto-generated method stub
		this.filmDal.update(film);
	}

	@Override
	@Transactional
	public void delete(Film film) {
		// TODO Auto-generated method stub
		this.filmDal.delete(film);
	}

	@Override
	@Transactional
	public Film getById(int id) {
		// TODO Auto-generated method stub
		return this.filmDal.getById(id);
	}

}
