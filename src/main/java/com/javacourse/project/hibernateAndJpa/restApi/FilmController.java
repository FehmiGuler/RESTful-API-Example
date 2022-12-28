package com.javacourse.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacourse.project.hibernateAndJpa.Business.IFilmService;
import com.javacourse.project.hibernateAndJpa.Entities.Film;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	private IFilmService filmService;

	public FilmController(IFilmService filmService) {
		super();
		this.filmService = filmService;
	}
	@GetMapping("/films")
	public List<Film> get(){
		return filmService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Film film){
		filmService.add(film);
	}	
	@PostMapping("/update")
	public void update(@RequestBody Film film){
		filmService.update(film);
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Film film){
		filmService.delete(film);
	}
	@GetMapping("/films/{id}")
	public Film getById(@PathVariable int id){
		return filmService.getById(id);
	}
}
