package com.mrxyayodev.ejemplos.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mrxyayodev.ejemplos.models.Equipo;
import com.mrxyayodev.ejemplos.models.Jugador;


@Service("equipoColombia")
public class EquipoService  implements IService {


	public List<Equipo> getTodos() {
		
		Equipo junior = new Equipo();
		junior.setNombre("Junior");
		junior.addJugador(new Jugador("Carlos Bacca", 70));
		junior.addJugador(new Jugador("Santiago Mele", 1));
		junior.addJugador(new Jugador("Deiber Caicedo", 20));
		junior.addJugador(new Jugador("Emanuel Olivera", 02));

		Equipo millonarios = new Equipo();
		millonarios.setNombre("Millonarios");
		millonarios.addJugador(new Jugador("Jorge Arias", 2));
		millonarios.addJugador(new Jugador("Beckand David", 20));
		millonarios.addJugador(new Jugador("Leonardo Castro", 9));
		millonarios.addJugador(new Jugador("Alvaro Montero", 1));

		return List.of(junior, millonarios);
	}
	
	
	
}