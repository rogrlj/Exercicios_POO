package Exercicio06;

public class Aeroporto {
	
	String nomeAeroporto;
	String localizacao;
	int numeroPista;
	Aeronave aviao;
	
	public Aeroporto(String nomeAeroporto, String localizacao, int numeroPista, Aeronave aviao) {
		
		this.nomeAeroporto = nomeAeroporto;
		this.localizacao = localizacao;
		this.numeroPista = numeroPista;
		this.aviao = aviao;
	}
	
	public void voo () {
		System.out.println("O avião " + aviao.numeroAviao + " saiu de " + localizacao + 
				", no Aeroporto " + nomeAeroporto + ", na pista " + numeroPista );
	}
	
	public void pouso () {
		System.out.println("O avião " + aviao.numeroAviao + " pousou em " + localizacao + 
				", no Aeroporto " + nomeAeroporto + ", na pista " + numeroPista );
	}
	
	
}
