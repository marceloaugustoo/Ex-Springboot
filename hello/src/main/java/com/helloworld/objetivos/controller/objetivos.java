package com.helloworld.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivos {
	
	@GetMapping
	public String objetivo() {
		return "Meus principais objetivos na semana são: absorver o maximo possivel "
				+ "dos conteúdos e dar continuidade ao PI.";
	}
	
	

}