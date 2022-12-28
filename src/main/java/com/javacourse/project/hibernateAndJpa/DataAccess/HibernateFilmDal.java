package com.javacourse.project.hibernateAndJpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Film;

import jakarta.persistence.EntityManager;
/*
	save() was never part of JPA. Since hibernate came before JPA they continued with it and now deprecated and will be removed in the future.
	persist(): Persist methods are used to save newly created entities
	merge(): should be used to update detached entity object.
	update(): It forces the transition of Entity obj from detached to persistent state. It doesn't make unnecessary SELECT calls unlike merge()
	Note: INSERT statements will occur only upon committing the transaction, or flushing or closing the session.
 */
@Repository
public class HibernateFilmDal implements IFilmDal{
	
	private EntityManager entityManager;
/*Hibernate enjeksiyonu yapan yapi*/	
	@Autowired 
	public HibernateFilmDal(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
/*Session acip kapayan yapi*/
	@Override
	@Transactional 
	public List<Film> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Film>	films = session.createQuery("from Film",Film.class).getResultList(); 
		return films;
	}

	@Override
	public void add(Film film) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(film);
		
	}

	@Override
	public void update(Film film) {
		Session session = entityManager.unwrap(Session.class);
		session.merge(film);
		
	}

	@Override
	public void delete(Film film) {
		Session session = entityManager.unwrap(Session.class);
		Film filmToRemove = session.get(Film.class, film.getFilm_id());
		session.remove(filmToRemove);
		
	}
	@Override
	public Film getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Film film = session.get(Film.class, id);
		return film;
	}

}
