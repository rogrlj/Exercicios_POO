package Exercicio04;

public class Televisao {
	
	String marca;
	int tamanhoPolegadas;
	String modelo;
	String cor;
	int peso;
	
		public Televisao (String marca, int tamanhoPolegadas, String modelo, String cor, int peso) {
			
			this.marca = marca;
			this.tamanhoPolegadas = tamanhoPolegadas;
			this.modelo = modelo;
			this.cor = cor;
			this.peso = peso;
		}
	
	
	
		public void ligar() {
			System.out.println("Ligar a TV");
		}
		
		public void mudarCanal() {
			System.out.println("Mudar o canal da TV");
		}
		
		public void desligar () {
			System.out.println("Desligar a TV");
		}
		
		public static void main (String [] args) {
			
			Televisao tv1 = new Televisao("LG", 65, "Smart OLED", "Preto", 25);
			Televisao tv2 = new Televisao("Samsung", 50, "CrystalUHD", "Cinza", 16);
			
			tv1.ligar();
			tv1.mudarCanal();
			tv1.desligar();
			
			tv2.ligar();
			tv2.mudarCanal();
			tv2.desligar();
		}

}
