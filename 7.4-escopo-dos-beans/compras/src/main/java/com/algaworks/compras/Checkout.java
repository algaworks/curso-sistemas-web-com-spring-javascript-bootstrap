package com.algaworks.compras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Checkout {
	
	private int count;
	
	@Autowired
	private Impressora impressora;
	
	public void finalizar() {
		// regras do checkout
		this.impressora.imprimir("compra10.csv");
		count++;
	}
	
	public int getQuantidadePedidosFinalizados() {
		return count;
	}
	
}
