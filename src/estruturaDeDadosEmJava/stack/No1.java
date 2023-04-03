package estruturaDeDadosEmJava.stack;

public class No1 {
	
	private int dado;
	private No1 reNo = null;
	
	public No1(int dado) {
		super();
		this.dado = dado;
	}

	public No1() {
		super();
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public No1 getReNo() {
		return reNo;
	}

	public void setReNo(No1 reNo) {
		this.reNo = reNo;
	}

	@Override
	public String toString() {
		return "No1 [dado=" + dado + "]";
	}
	

}
