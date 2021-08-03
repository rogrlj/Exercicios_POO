package Exercicio04;

public class Caderno {
	
	int numeroFolhas;
	String cor;
	String marca;
	int numeroMaterias;
	String tamanhoPapel;
	
		public Caderno (int numeroFolhas, String cor, String marca, int numeroMaterias, String tamanho) {
			this.numeroFolhas = numeroFolhas;
			this.cor = cor;
			this.marca = marca;
			this.numeroMaterias = numeroMaterias;
			this.tamanhoPapel = tamanho;
		}
	
		public void escrever () {
			System.out.println("Escrever no caderno");
		}
		
		public void ler () {
			System.out.println("Ler o caderno");
		}
		
		public void guardar () {
			System.out.println("Guardar o caderno");
		}
	
	 public static void main (String[] args) {
		 
		 Caderno c1 = new Caderno(100, "preto", "Tilibra", 10, "A4");
		 Caderno c2 = new Caderno(50, "verde", "Foroni"	, 5, "A5");
		 
		 c1.escrever();
		 c1.ler();
		 c1.guardar();
		 
		 c2.escrever();
		 c2.ler();
		 c2.guardar();
	 }
}
