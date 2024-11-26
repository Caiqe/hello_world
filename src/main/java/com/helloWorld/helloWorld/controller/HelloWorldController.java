package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsms-generation")
	public String mentalidades() {
		return "MENTALIDADES: \n\nPersistência\nAtenção aos Detalhes\nMentalidade de Crescimento\nOrientação ao Futuro";
	}
	@GetMapping("/objetivos-semana")
	public String objetivos() {
		return "OBJETIVOS: \n\nAprender mais sobre API Spring\nPráticar mais com Spring\nTrocar conhecimentos com os colegas";
	}

}
