package Exercicio01;

public class Stack {
	
	public static void testeMemoriaStack(int x) {
		if (x != 1000) {
			testeMemoriaStack(x++);
		}
	}

	public static void main(String[] args) {
		
		int valor = 1;
		testeMemoriaStack (valor);

	}

}
