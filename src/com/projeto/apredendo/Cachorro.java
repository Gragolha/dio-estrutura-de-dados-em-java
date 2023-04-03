package com.projeto.apredendo;

public class Cachorro extends Animals {

	public Cachorro() {
		super(4, true, TipoAlimentacao.ONIVORO);
	}

	public void latir() {
		System.out.println("auau");
	}

}
