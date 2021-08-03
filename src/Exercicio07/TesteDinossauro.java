package Exercicio07;

import java.util.Scanner;

public class TesteDinossauro {

	
	public static void main(String[] args) {
		
		Dinossauro skeep = new Dinossauro(5, 5, 5, 5);
		Scanner scan = new Scanner(System.in);;
		int rodada = 1;
		
		while (rodada < 10000) {
			
			tela(skeep);	
			
			String textoMaiusculo = scan.nextLine().toUpperCase();
			char letra = textoMaiusculo.charAt(0);
			
			acao(letra, skeep);
			
			rodada++;
						
		}
		
		
	}

	private static void acao(char letra, Dinossauro skeep) {
		
		switch (letra) {
			case 'P': skeep.pular();
				break;
			case 'B': skeep.brincar();
				break;
			case 'R': skeep.correr();
				break;
			case 'S': skeep.tomarSol();
				break;
			case 'C': skeep.comer();
				break;
			case 'O': skeep.ficarNaSombra();
				break;
			default : System.out.println("Opção invalida");
		}
		
	}

	private static void tela(Dinossauro skeep) {
		System.out.println("   Dinossauro Skeep   ");
		System.out.println("\nDados do Skeep: ");
		System.out.println("Energia: " + skeep.energia + "\nVelocidade: " + skeep.velocidade +
							"\nTemperatura: "+ skeep.temperatura + "\nHumor" + skeep.humor);
		System.out.println("\n================================================================");
		System.out.println("\nSelecione a próxima ação de Skeep: \n" + 
							"\n(P)ular \n(B)rincar \nco(R)rer \nTomar (S)ol \n(C)omer \nFicar na S(O)mbra" );
		
	}

}
