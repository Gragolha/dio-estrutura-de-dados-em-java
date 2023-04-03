package com.projeto.apredendo;

public abstract class Animals {

	protected int quantMembros;
	protected boolean pelo;
	protected TipoAlimentacao alimentacao;

	public Animals(int quantMembros, boolean pelo, TipoAlimentacao alimentacao) {
		super();
		this.quantMembros = quantMembros;
		this.pelo = pelo;
		this.alimentacao = alimentacao;

	}

	public int getQuantMembros() {
		return quantMembros;
	}

	public void setQuantMembros(int quantMembros) {
		this.quantMembros = quantMembros;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}

	public  TipoAlimentacao getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(TipoAlimentacao alimentacao) {
		this.alimentacao = alimentacao;
	}

}
