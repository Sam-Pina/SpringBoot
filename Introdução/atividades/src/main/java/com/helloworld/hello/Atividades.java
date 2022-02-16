package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Atividades {
 
	@GetMapping("/atividade1")
		public String atividade1() {
		return "Habilidades utilizadas: \nPersistencia, \nResponsabilidade Pessoal, \nOrientação ao futuro, \nOrientação ao detalhe.";
	}
	
	@GetMapping("/atividade2")
	public String atividade2() {
	return "Objetivos: \nAprender sobre Spring Boot, para não ficar perdidos em relação ao conteúdo e ajudar no projeto integrador";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Atividades.class, args);
	}

}
