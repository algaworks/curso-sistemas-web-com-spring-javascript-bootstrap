package com.algaworks.compras;

public class Checkout {

	private Impressora impressora;

	public Checkout(Impressora impressora) {
		this.impressora = impressora;
	}
	
	public void finalizar() {
		// regras do checkout
		this.impressora.imprimir("compra10.csv");
	}
	
}
