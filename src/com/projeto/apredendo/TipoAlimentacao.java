package com.projeto.apredendo;

public enum TipoAlimentacao {

	HERBIVORO(0), CARNIVORO(1), ONIVORO(2);
	private int value;

	private TipoAlimentacao(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}


}


