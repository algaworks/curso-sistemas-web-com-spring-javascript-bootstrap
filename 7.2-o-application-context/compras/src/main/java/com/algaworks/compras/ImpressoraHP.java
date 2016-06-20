package com.algaworks.compras;

public class ImpressoraHP implements Impressora {

	@Override
	public void imprimir(String documento) {
		System.out.println(">>>> Imprimindo na HP o " + documento);
	}
	
}
