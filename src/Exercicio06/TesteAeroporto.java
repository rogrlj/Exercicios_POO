package Exercicio06;

public class TesteAeroporto {

	public static void main(String[] args) {
		
		Passageiro passageiro1 = new Passageiro("Rogério", 26, 54, 13, 313109002, "Execultiva");
		Piloto piloto1 = new Piloto("Giovani", 40, 70, 1002, 1000, "A");
		Aeronave aviao1 = new Aeronave(150, "GOL", 532);
		Aeroporto aeroporto1 = new Aeroporto("Cumbica", "São Paulo", 1, aviao1);
		Aeroporto aeroporto2 = new Aeroporto("Santos Dumont", "Rio de Janeiro", 3 , aviao1);
		
		passageiro1.embarca();
		passageiro1.sentarLugar();
		
		piloto1.embarca();
		piloto1.pilotaAviao();
		
		aviao1.levantarVoo();
		
		aeroporto1.voo();
		aeroporto2.pouso();
		
		aviao1.desembarque();
	}

}
