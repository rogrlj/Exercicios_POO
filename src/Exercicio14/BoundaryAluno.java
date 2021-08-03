package Exercicio14;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;
import javafx.util.converter.LongStringConverter;

public class BoundaryAluno extends Application {
	
	 private TextField txtId = new TextField("");
	 private TextField txtRa = new TextField("");
	 private TextField txtNome = new TextField("");
	 private TextField txtNascimento = new TextField("");
	 
	 private Button btnAdicionar = new Button("Adicionar");
	 private Button btnPesquisar = new Button("Pesquisar");
	 
	 private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 

	 
	 private ControlAluno control = new ControlAluno();
	
	@SuppressWarnings("unchecked")
	@Override
	public void start (Stage stage) throws Exception {
		GridPane pane = new GridPane();
		Scene scn = new Scene(pane, 300, 150);
		
		
		pane.add(new Label("Id: "), 0, 0);
        pane.add(txtId, 1, 0);
        pane.add(new Label("Ra: "), 0, 1);
        pane.add(txtRa, 1, 1);
        pane.add(new Label("Nome: "), 0, 2);
        pane.add(txtNome, 1, 2);
        pane.add(new Label("Nascimento: "), 0, 3);
        pane.add(txtNascimento, 1, 3);
        pane.add(btnAdicionar, 0, 4);
        pane.add(btnPesquisar, 1, 4);
        
        
        btnAdicionar.setOnAction((e) -> { control.adicionar();});
        btnPesquisar.setOnAction((e) -> { control.pesquisarPorNome();});
        

        StringConverter<LocalDate> dateConverter = new LocalDateStringConverter(formatter, formatter);
        @SuppressWarnings("rawtypes")
   	 	StringConverter longConverter = new LongStringConverter();

        
        Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());
        Bindings.bindBidirectional(txtRa.textProperty(), control.raProperty());
        Bindings.bindBidirectional(txtId.textProperty(), control.idProperty(), longConverter);
        Bindings.bindBidirectional(txtNascimento.textProperty(), control.nascimentoProperty(), dateConverter);
        
        
        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();
        
	}
	

	
	
	public static void main(String[] args) {
        Application.launch(BoundaryAluno.class, args);
    }
}
