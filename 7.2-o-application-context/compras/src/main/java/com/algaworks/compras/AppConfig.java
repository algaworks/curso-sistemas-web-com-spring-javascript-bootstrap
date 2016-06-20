package com.algaworks.compras;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Impressora impressora() {
		return new ImpressoraEpson();
	}
	
	@Bean
	public Checkout checkout(Impressora impressora) {
		return new Checkout(impressora);
	}
	
}

