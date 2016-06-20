package com.algaworks.compras;

public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(String documento) {
		System.out.println("Imprimindo na Epson o " + documento);
		
	}

}
