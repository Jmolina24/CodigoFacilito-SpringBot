package com.mrxyayodev.peliculas.services;

import java.util.List;

import com.mrxyayodev.peliculas.entities.Pelicula;

public interface IPeliculaService {

	public void save(Pelicula pelicula);

	public Pelicula findByPelicula(Long id);

	public List<Pelicula> findAll();

	public void delete(Long id);
}
