package estruturaDeDadosEmJava.stack;


public class Pilha {

	private No1 refNoEntradaPilha;

	public Pilha() {
		super();

		this.refNoEntradaPilha = null;
	}

	public No1 pop() {
		if (!this.isEmpty()) {
			No1 noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getReNo();
			return noPoped;
		}
		return null;
	}

	public void push(No1 novoNo) {
		No1 refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setReNo(refAuxiliar);
	}

	public No1 top() {
		return refNoEntradaPilha;
	}

	public boolean isEmpty() {

		if (refNoEntradaPilha == null) {

			return true;
		}
		return false;
	}

	@Override
	public String toString() {

		String stringRetorno = "------------------\n";
		stringRetorno += "     Pilha\n";
		stringRetorno += "------------------\n";

		No1 noAuxiliar = refNoEntradaPilha;

		while (true) {
			if (noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]";
				noAuxiliar = noAuxiliar.getReNo();
			} else {
				break;
			}
		}
		stringRetorno += "============\n";
		return stringRetorno;
	}

}
