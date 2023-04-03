package estruturaDeDadosEmJava.stack;

public class Main {

	public static void main(String[] args) {
		
		
		Pilha minhaPilha = new Pilha();
		
		
		minhaPilha.push(new No1(1));
		minhaPilha.push(new No1(2));
		minhaPilha.push(new No1(3));
		minhaPilha.push(new No1(4));
		minhaPilha.push(new No1(5));
		minhaPilha.push(new No1(6));
		
		System.out.println(minhaPilha);
		
		System.out.println(minhaPilha.pop());
		
		System.out.println(minhaPilha);
		
		

	}

}
