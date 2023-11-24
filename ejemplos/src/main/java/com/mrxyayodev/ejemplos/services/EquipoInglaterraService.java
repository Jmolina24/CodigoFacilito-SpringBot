package com.mrxyayodev.ejemplos.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.mrxyayodev.ejemplos.models.Equipo;
import com.mrxyayodev.ejemplos.models.Jugador;

@Service
@Primary
public class EquipoInglaterraService  implements IService{

	@Override
	public List<Equipo> getTodos() {
		Equipo liverpool = new Equipo();
		liverpool.setNombre("Liverpool");
		liverpool.addJugador(new Jugador("Luis Diaz", 7));
		liverpool.addJugador(new Jugador("Darwin Nunez", 9));

		Equipo manchesterCity = new Equipo();
		manchesterCity.setNombre("ManchesterCity");
		manchesterCity.addJugador(new Jugador("Julian Alvarez", 20));
		manchesterCity.addJugador(new Jugador("Bernando Silva", 10));

		return List.of(liverpool, manchesterCity);
	}

	
	
}