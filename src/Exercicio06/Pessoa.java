package Exercicio06;

public class Pessoa {
	
	String nome;
	int idade;
	int peso;
	
	public Pessoa(String nome, int idade, int peso) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void embarca () {
		System.out.println(nome + " embarcou no avião");
	}
	
}
