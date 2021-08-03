package Exercicio06;

public class Aeronave {
	
	int capacidade;
	String companhia;
	int numeroAviao;
	
	public Aeronave(int capacidade, String companhia, int numeroAviao) {
		
		this.capacidade = capacidade;
		this.companhia = companhia;
		this.numeroAviao = numeroAviao;
	}
	
	public void levantarVoo () {
		System.out.println("O avião " + numeroAviao + ", da companhia " + companhia + 
				", levantou voo, transportando " + capacidade + " passageiros");
	}
	
	public void desembarque () {
		System.out.println("Os " + capacidade + " passageiros do avião " + numeroAviao + " desembarcaram.");
	}

}
