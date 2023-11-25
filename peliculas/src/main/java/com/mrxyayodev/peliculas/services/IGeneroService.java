package com.mrxyayodev.peliculas.services;

import java.util.List;

import com.mrxyayodev.peliculas.entities.Genero;

public interface IGeneroService {

	public void save (Genero genero);
	public Genero findById(Long id);
	public void delete (Long id);
	public List<Genero> findAlList();
}
