package Exercicio08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TelaPrincipal extends Application {
    public void start(Stage stage){
    	
        Pane pane = new Pane();
        Scene scn = new Scene(pane);
        Label lblId = new Label("Id");
        Label lblNome = new Label("Nome");
        Label lblTelefone = new Label("Telefone");
        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");
        TextField textId = new TextField();
        TextField textNome = new TextField();
        TextField textTelefone = new TextField();
        
        pane.getChildren().add(lblId);
        pane.getChildren().add(lblNome);
        pane.getChildren().add(lblTelefone);
        pane.getChildren().add(btnSalvar);
        pane.getChildren().add(btnPesquisar);
        pane.getChildren().add(textId);
        pane.getChildren().add(textNome);
        pane.getChildren().add(textTelefone);
        
        btnSalvar.relocate(50, 200);
        btnPesquisar.relocate(100, 200);
        lblId.relocate(50, 50);
        lblNome.relocate(50, 100);
        lblTelefone.relocate(50, 150);
        textId.relocate(100, 50);
        textNome.relocate(100, 100);
        textTelefone.relocate(100, 150);
        
        stage.setScene(scn);
        stage.setTitle("Untitled");
        stage.setWidth(600);
        stage.setHeight(300);
        stage.show();
        
    }
    public static void main(String[] args) {
        System.out.println("Teste de Java FX");
        Application.launch(TelaPrincipal.class, args);
    }
}