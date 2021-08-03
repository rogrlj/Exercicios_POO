package Exercicio06;

public class Piloto extends Pessoa{
	
	int breve;
	int horasVoo;
	String categoria;
	
//	public Piloto(String nome, int idade, int peso) {
//		super(nome, idade, peso);
//	}
	
	public Piloto(String nome, int idade, int peso, int breve, 
						int horasVoo, String categoria) {
		super(nome, idade, peso);
		this.breve = breve;
		this.horasVoo = horasVoo;
		this.categoria = categoria;
	}
	
	public void pilotaAviao () {
		System.out.println("O piloto " + nome + " está pilotando o avião");
	}

}
