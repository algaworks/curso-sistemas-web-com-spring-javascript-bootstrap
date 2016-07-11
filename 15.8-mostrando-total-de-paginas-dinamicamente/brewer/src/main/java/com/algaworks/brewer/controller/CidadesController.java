package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CidadesController {

	@RequestMapping("/cidades/nova")
	public String nova() {
		return "cidade/CadastroCidade";
	}
	
}
