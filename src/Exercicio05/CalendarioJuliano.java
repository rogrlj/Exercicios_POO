package Exercicio05;

public class CalendarioJuliano {
	
	int data_juliana;
	int dia;
	int mes;
	int ano;
	
		public CalendarioJuliano(int dia, int mes, int ano) {
			
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}
		
		public void converteCalendario () {
			data_juliana = ( 1461 * ( ano + 4800 + ( mes - 14)/12 )  ) / 4 +
						( 367 * ( mes - 2- 12 * (  ( mes - 14)/12 )  ) ) /12 - ( 3 * 
								( ( ano + 4900 + ( mes - 14 ) / 12 ) / 100 )  ) / 4 + dia - 32075;
			
			System.out.println(data_juliana);
		}

	public static void main(String[] args) {
		
		CalendarioJuliano data = new CalendarioJuliano(5 , 8, 2016);
		
		data.converteCalendario();

	}

}
