package Exercicio15;

import java.time.LocalDate;


import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControlAluno {
	
	private ObservableList<Aluno> lista = FXCollections.observableArrayList();
	private TableView<Aluno> table = new TableView<Aluno>();
	
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
	
	public void generateTable() {
		TableColumn<Aluno, Long> colId = new TableColumn<>("Id");
		colId.setCellValueFactory(new PropertyValueFactory<Aluno, Long>("id"));
		
		TableColumn<Aluno, String> colRa = new TableColumn<>("RA");
		colRa.setCellValueFactory(new PropertyValueFactory<Aluno, String>("ra"));
		
		TableColumn<Aluno, String> colNome = new TableColumn<>("Nome");
		colNome.setCellValueFactory(new PropertyValueFactory<Aluno, String>("nome"));
		
		TableColumn<Aluno, LocalDate> colNascimento = new TableColumn<>("Nascimento");
		colNascimento.setCellValueFactory(new PropertyValueFactory<Aluno, LocalDate>("nascimento"));
		
		table.getColumns().addAll(colId, colRa, colNome, colNascimento);
		table.setItems(lista);
		
		
	}

	public TableView<Aluno> getTable() {
		return table;
	}

}
