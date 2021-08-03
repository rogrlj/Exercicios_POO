package Exercicio10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaFormulario extends Application {
    public void start(Stage stage){
    	
        VBox pane = new VBox();
        TilePane pane1= new TilePane();
        TilePane pane2= new TilePane();
        TilePane pane3= new TilePane();
        FlowPane pane4= new FlowPane();
        
        Scene scn = new Scene(pane);
        Label lblId = new Label("Id");
        Label lblNome = new Label("Nome");
        Label lblTelefone = new Label("Telefone");
        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");
        TextField textId = new TextField();
        TextField textNome = new TextField();
        TextField textTelefone = new TextField();
        
        pane1.setHgap(50);
        pane1.setPrefColumns(2);
        pane1.getChildren().addAll(lblId, textId);
        
        pane2.setHgap(50);
        pane1.setPrefColumns(2);
        pane2.getChildren().addAll(lblNome, textNome);
        
        pane3.setHgap(50);
        pane1.setPrefColumns(2);
        pane3.getChildren().addAll(lblTelefone, textTelefone);
        
        pane4.getChildren().addAll(btnSalvar, btnPesquisar);
        
        pane.getChildren().addAll(pane1, pane2, pane3, pane4);


        
        stage.setScene(scn);
        stage.setTitle("Untitled");
        stage.setWidth(400);
        stage.setHeight(200);
        stage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(TelaFormulario.class, args);
    }
}