package com.projeto.atribuicaoReferencia;

public class MeuObj {
	
	Integer num;

	public void setNum(Integer num) {
		this.num = num;
		
	}

	public MeuObj(Integer num) {
		super();
		this.num = num;
	}



	@Override
	public String toString() {
		return this.num.toString();
	}

}
