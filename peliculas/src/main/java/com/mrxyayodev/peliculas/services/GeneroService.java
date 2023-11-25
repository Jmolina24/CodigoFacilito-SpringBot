package com.mrxyayodev.peliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mrxyayodev.peliculas.dao.IGeneroRepository;
import com.mrxyayodev.peliculas.entities.Genero;

@Service
public class GeneroService  implements IGeneroService{

	@Autowired
	private IGeneroRepository generoRepository;
	
	
	@Override
	public void save(Genero genero) {
		generoRepository.save(genero);
		
	}

	@Override
	public Genero findById(Long id) {
		// TODO Auto-generated method stub
		return generoRepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		generoRepository.deleteById(id);
		
	}

	@Override
	public List<Genero> findAlList() {
		// TODO Auto-generated method stub
		return (List<Genero>) generoRepository.findAll();
	}

	
	
	
	
}
