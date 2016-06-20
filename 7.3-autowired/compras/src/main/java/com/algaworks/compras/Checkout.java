package com.algaworks.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Checkout {

	@Autowired
	private Impressora impressora;
	
	public void finalizar() {
		// regras do checkout
		this.impressora.imprimir("compra10.csv");
	}

}
