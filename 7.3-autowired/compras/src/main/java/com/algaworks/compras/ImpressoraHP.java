package com.algaworks.compras;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(String documento) {
		System.out.println(">>>> Imprimindo na HP o " + documento);
	}
	
}
