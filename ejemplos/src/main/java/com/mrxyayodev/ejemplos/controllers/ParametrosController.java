package com.mrxyayodev.ejemplos.controllers;

//import java.util.List;
import java.util.Optional;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.mrxyayodev.ejemplos.models.Equipo;
import com.mrxyayodev.ejemplos.models.Jugador;
import com.mrxyayodev.ejemplos.services.IService;

@Controller
public class ParametrosController {

	/*
	 * Opcion Numero 1 // Inyectar Dependencia de EquipoService
	 * 
	 * @Autowired 
	 * IService equipoService;
	 * 
	 */

	private IService equipoService;

	public ParametrosController(@Qualifier("equipoColombia")  IService equipoService) {
		this.equipoService = equipoService;

	}

	@GetMapping(value = "/parametros")
	public String paramentros(@RequestParam(defaultValue = "") String valor, Model model) {
		model.addAttribute("titulo", "Paramentros");
		model.addAttribute("paramentro", valor);
		return "parametros";
	}

	@GetMapping(value = "/parametros2")
	public String paramentros(@RequestParam(defaultValue = "") String valor,
			@RequestParam(defaultValue = "", name = "valor_dos") String otrovalor, Model model) {
		model.addAttribute("titulo", "Paramentros");
		model.addAttribute("paramentro", valor);
		model.addAttribute("otrovalor", otrovalor);
		return "parametros";
	}

	@GetMapping(value = "/team/{name}/{number}")
	public String parametrosPorPath(@PathVariable String name, @PathVariable("number") Integer number, Model model) {

		Optional<Equipo> equipoOptional = equipoService.getTodos().stream()
				.filter(equipo -> name.toLowerCase().equals(equipo.getNombre().toLowerCase())).findFirst();

		if (equipoOptional.isPresent()) {
			Optional<Jugador> jugadorOptional = equipoOptional.get().getPlantilla().stream()
					.filter(jugador -> number == jugador.getNumero()).findFirst();

			if (jugadorOptional.isPresent()) {
				model.addAttribute("jugador", jugadorOptional.get());

			}
		}

		return "parametros";
	}

}