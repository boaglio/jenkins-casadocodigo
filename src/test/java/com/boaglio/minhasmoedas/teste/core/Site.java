package com.boaglio.minhasmoedas.teste.core;

public enum Site {

	host("http://localhost:8080/minhasmoedas/"),
	homeTitle("Minhas Moedas"),
	cambio("cambio"),
	cambioValidation1("de hoje"),
	cambioValidation2("Intervalo");


	Site (String n) {
		this.value=n;
	}

	private String value;

	public String value() {
		return value;
	}
}
