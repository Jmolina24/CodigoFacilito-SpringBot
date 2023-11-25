package com.mrxyayodev.peliculas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mrxyayodev.peliculas.entities.Pelicula;
import com.mrxyayodev.peliculas.services.IPeliculaService;



@Controller
public class PeliculaController {

	
	private IPeliculaService service;
	
	public PeliculaController (IPeliculaService service) {
		this.service = service;
	}

	@GetMapping("/pelicula")
	public String crear(Model model) {
		Pelicula pelicula = new Pelicula();
		model.addAttribute("title","Nueva Pelicula");
		model.addAttribute("pelicula", pelicula);
		return "pelicula";
	}
	
	@GetMapping("/pelicula/{id}")
	public String editar(@PathVariable(name="id") Long id,  Model model) {
		Pelicula pelicula = new Pelicula();
		model.addAttribute("title","Editar Pelicula");
		model.addAttribute("pelicula", pelicula);
		return "pelicula";
	}
	
	
}
