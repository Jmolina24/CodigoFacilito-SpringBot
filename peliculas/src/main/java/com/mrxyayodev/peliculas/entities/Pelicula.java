package com.mrxyayodev.peliculas.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable{

	private static final long serialVersionUID = -7256978228693469754L;

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name = "fecha_estreno")
	@Temporal(TemporalType.DATE)
	private Date fechaEstreno;
	private Genero genero;
	private List<Actor> protagonista;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaEstreno() {
		return fechaEstreno;
	}
	public void setFechaEstreno(Date fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public List<Actor> getProtagonista() {
		return protagonista;
	}
	public void setProtagonista(List<Actor> protagonista) {
		this.protagonista = protagonista;
	}
	
	
	
	
}
