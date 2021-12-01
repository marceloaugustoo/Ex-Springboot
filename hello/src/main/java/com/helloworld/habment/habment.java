package com.helloworld.habment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habment")
public class habment {
	
	@GetMapping
	public String habilidades() {
		return "Para realizar esta atividade utilizei a persistencia e atenção aos detalhes!";
	}
	
	

}