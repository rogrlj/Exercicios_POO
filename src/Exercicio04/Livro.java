package Exercicio04;

public class Livro {
	
	String nomeLivro;
	String nomeAutor;
	int numeroPaginas;
	String editora;
	int anoPublicacao;
	
		public Livro (String nomeLivro, String nomeAutor, int numeroPaginas,
						String editora, int anoPublicacao) {
			
			this.nomeLivro = nomeLivro;
			this.nomeAutor = nomeAutor;
			this.numeroPaginas = numeroPaginas;
			this.editora = editora;
			this.anoPublicacao = anoPublicacao;
		}
	
		public void ler () {
			System.out.println("Ler o livro");
		}
		
		public void pegar () {
			System.out.println("Pegar o livro");
		}
		
		public void guardar () {
			System.out.println("Guardar o livro");
		}
		
		
		public static void main (String [] args) {
			
			Livro l1 = new Livro("One Piece", "Eiichiro Oda", 224 , "Shueisha", 1997);
			Livro l2 = new Livro("O Auto da Compadecida", "Ariano Suassuna", 208, "Nova Fronteira", 2018);
			
			l1.ler();
			l1.pegar();
			l1.guardar();
			
			l2.ler();
			l2.pegar();
			l2.guardar();
		}

}
