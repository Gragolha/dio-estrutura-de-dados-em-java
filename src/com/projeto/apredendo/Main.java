package com.projeto.apredendo;

public class Main {

	public static void main(String[] args) {

		Cachorro puldogue = new Cachorro();
		Cachorro manco = new Cachorro();
		puldogue.latir();
		
		manco.setAlimentacao(TipoAlimentacao.CARNIVORO);
		
		System.out.println(manco.getAlimentacao().getValue());
	}

}
