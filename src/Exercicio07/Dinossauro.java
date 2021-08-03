package Exercicio07;

public class Dinossauro {
	
	int energia;
	int velocidade;
	int temperatura;
	int humor;
	
	public Dinossauro(int energia, int velocidade, int temperatura, int humor) {
		
		this.energia = energia;
		this.velocidade = energia;
		this.temperatura = temperatura;
		this.humor = humor;
		
	}
	
	public void pular () {
		
		energia --;
		humor ++;
		System.out.println("\nSkeep pulou");
		System.out.println("\n================================================================\n");
	}
	
	public void correr () {
		
		energia --;
		humor ++;
		System.out.println("\nSkeep correu");
		System.out.println("\n================================================================\n");
	}

	public void comer () {
		
		energia ++;
		humor ++;
		System.out.println("\nSkeep comeu");
		System.out.println("\n================================================================\n");
	}
	
	public void brincar () {
		
		energia --;
		humor ++;
		System.out.println("\nSkeep brincou");
		System.out.println("\n================================================================\n");
	}
	
	public void tomarSol () {
		
		velocidade ++;
		energia --;
		humor ++;
		System.out.println("\nSkeep tomou sol");
		System.out.println("\n================================================================\n");
	}
	
	public void ficarNaSombra () {
		
		energia ++;
		humor --;
		System.out.println("\nSkeep ficou na sombra");
		System.out.println("\n================================================================\n");
	}
}
