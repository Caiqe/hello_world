package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	@GetMapping("/bsms-generation")
	public String mentalidades() {
		return "Persistência\nAtenção aos Detalhes\nMentalidade de Crescimento\nOrientação ao Futuro";
	}
	@GetMapping("/objetivos-semana")
	public String objetivos() {
		return "Aprender mais sobre API Spring\nPráticar mais com Spring\nTrocar conhecimentos com os colegas";
	}

}
