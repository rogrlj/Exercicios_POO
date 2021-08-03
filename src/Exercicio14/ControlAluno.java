package Exercicio14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class ControlAluno {
	
	private List<Aluno> lista = new ArrayList<>();
	
	 private StringProperty nome = new SimpleStringProperty("");
	 public StringProperty nomeProperty() {
		 return nome;
	}
	 
	private StringProperty ra = new SimpleStringProperty("");
	public StringProperty raProperty() {
		return ra;
	}
	
	private LongProperty id = new SimpleLongProperty(0);
	public LongProperty idProperty() {
		return id;
	}
	
	private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<LocalDate>();
	public ObjectProperty<LocalDate> nascimentoProperty() {
		return nascimento;
	}
	
	public Aluno getEntity() {
		Aluno a = new Aluno();
		a.setId(id.get());
		a.setNome(nome.get());
		a.setRa(ra.get());
		a.setNascimento(nascimento.get());
		return a;
	}
	
	private void setEntity(Aluno a) {
		if (a != null) {
			id.set(a.getId());
			nome.set(a.getNome());
			ra.set(a.getRa());
			nascimento.set(a.getNascimento());
		}
	}
	
	public void adicionar() {
		lista.add(getEntity());
	}
	
	public void pesquisarPorNome () {
		
		for (Aluno a: lista) {
			if (a.getNome().contains(nome.get())) {
				setEntity(a);;
			}
		}
	}

}
