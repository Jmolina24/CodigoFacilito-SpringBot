package com.mrxyayodev.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrxyayodev.peliculas.dao.IPeliculaRepository;
import com.mrxyayodev.peliculas.entities.Pelicula;

@Service
public class PeliculaService implements IPeliculaService{

	@Autowired
	private IPeliculaRepository peliculaRepository;
	
	
	
	@Override
	public void save(Pelicula pelicula) {
		peliculaRepository.save(pelicula);
		
	}

	@Override
	public Pelicula findByPelicula(Long id) {
		// TODO Auto-generated method stub
		return peliculaRepository.findById(id).orElse(null);
	}

	@Override
	public List<Pelicula> findAll() {
		// TODO Auto-generated method stub
		return (List<Pelicula>) peliculaRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		peliculaRepository.deleteById(id);
		
	}

	
	
	
	
}
