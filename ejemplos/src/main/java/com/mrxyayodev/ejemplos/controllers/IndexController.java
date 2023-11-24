package com.mrxyayodev.ejemplos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping(value="/")
	public String index(Model model) {
		model.addAttribute("titulo", "Soy el titulo");
		model.addAttribute("saludo", "Hola Model");
		model.addAttribute("show", true);
		//List<String> series = List.of("Junior","Union Magdalena", "Real Cartagen");
		//model.addAttribute("series", series);
		
		return "index";
	}
	
	
	@GetMapping(value="/index-mv")
	public ModelAndView indexMV(ModelAndView mv) {
		mv.addObject("titulo", "Titulo de MV");
		mv.addObject("saludo", "Saludo de MV");
		mv.addObject("show", true);
		//List<String> series = List.of("Junior","Union Magdalena", "Real Cartagen");
		//mv.addObject("series", series);
		
		mv.setViewName("index");
		return mv;
	}
	
	
	@ModelAttribute("series")
	public List<String> getSeries() {
		return List.of("1-Junior","2-Union Magdalena", "3-Real Cartagen");
	}
	
	@PostMapping(value = "/index-post")
	public String indexRequestMapping() {
		//TODO: process POST request
		
		return "index";
	}

	/*
	@RequestMapping(value = "/index-req-mapping", method = RequestMethod.GET)
	public String indexRequestMapping() {
		return "index";
	}
	*/
}