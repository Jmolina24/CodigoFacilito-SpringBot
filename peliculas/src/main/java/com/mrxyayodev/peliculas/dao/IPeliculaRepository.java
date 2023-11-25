package com.mrxyayodev.peliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.mrxyayodev.peliculas.entities.Pelicula;

public interface IPeliculaRepository  extends CrudRepository<Pelicula,Long>{

}
