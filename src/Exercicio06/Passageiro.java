package Exercicio06;

public class Passageiro extends Pessoa{
	
	int cadeira;
	int numeroPassaporte;
	String classe;
	
	public Passageiro(String nome, int idade, int peso, int cadeira,
						int numeroPassaporte, String classe) {
		super(nome, idade, peso);
		this.cadeira = cadeira;
		this.numeroPassaporte = numeroPassaporte;
		this.classe = classe;
	}
	
	public void sentarLugar () {
		System.out.println("O passageiro " + nome + " está localizado na cadeira " + 
								cadeira + ", na classe " + classe);
	}

}
