package Exercicio13;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BoundaryAluno extends Application implements EventHandler<ActionEvent>{
	
	 private TextField txtId = new TextField("");
	 private TextField txtRa = new TextField("");
	 private TextField txtNome = new TextField("");
	 private TextField txtNascimento = new TextField("");
	 
	 private Button btnAdicionar = new Button("Adicionar");
	 private Button btnPesquisar = new Button("Pesquisar");
	 
	 private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 
	 private ControlAluno control = new ControlAluno();
	
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
        
        
        btnAdicionar.addEventFilter(ActionEvent.ACTION, this);
        btnPesquisar.addEventFilter(ActionEvent.ACTION, this);
        
        
        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();
        
	}
	
	public Aluno boundaryToEntity() {
		Aluno a = new Aluno();
		
		try {
			a.setNome(txtNome.getText());
			a.setRa(txtRa.getText());
			
			LocalDate d = LocalDate.parse(txtNascimento.getText(), formatter);
			a.setNascimento(d);
			
            a.setId(Long.parseLong(txtId.getText()));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return a;
		
	}
	
	public void entityToBoundary(Aluno a) {
		
		if (a != null) {
			try {
				txtNome.setText(a.getNome());
				txtRa.setText(a.getRa());
				
				String txtData = a.getNascimento().format(formatter);
				txtNascimento.setText(txtData);
				
				txtId.setText(String.valueOf(a.getId()));	
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


	@Override
	public void handle(ActionEvent event) {
		
		if(event.getSource() == btnAdicionar) {
			Aluno a = this.boundaryToEntity();
			control.adicionar(a);
		}
		else if (event.getSource() == btnPesquisar) {
			Aluno a = control.pesquisarPorNome(txtNome.getText());
			this.entityToBoundary(a);
		}
	}
	
	public static void main(String[] args) {
        Application.launch(BoundaryAluno.class);
    }
}
