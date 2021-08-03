package Exercicio12;

import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculadoraEventos extends Application implements EventHandler<MouseEvent> {
    public void start(Stage stage){
    	
    	final List<String> botoes = Arrays.asList(
                "1", "2", "3", "+",
                "4", "5", "6", "-",     // 7 / 4 = 1        7 % 4 = 3
                "7", "8", "9", "*",     // 10 / 4 = 2       10 % 4 = 3
                ".", "0", "=", "/" );
    	
        VBox pane = new VBox();
        HBox pane1 = new HBox();
        GridPane pane2 = new GridPane();
        Scene scn = new Scene(pane);
        
        TextField textVisor = new TextField();
        
        textVisor.setPrefWidth(100);
        
        Button btnCE = new Button("CE");
        btnCE.addEventFilter(MouseEvent.MOUSE_PRESSED, 
        		(event) -> {
        			  textVisor.setText(" ");          				
        			});
        
        for (int i = 0; i < botoes.size(); i++) {
            String nomeBotao = botoes.get(i);
            int row = i / 4;
            int col = i % 4;
            Button btn = new Button(nomeBotao);
            btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            GridPane.setHgrow(btn, Priority.ALWAYS);
            GridPane.setVgrow(btn, Priority.ALWAYS);
            pane2.add(btn, col, row);
            btn.addEventFilter(MouseEvent.MOUSE_PRESSED, 
            		(event) -> {
            			  textVisor.setText(nomeBotao);          				
            			});
        }
            
            
               
        
        pane1.getChildren().addAll(textVisor, btnCE);
        
        
        pane2.setHgap(10);
        pane2.setVgap(10);
        
        pane.getChildren().addAll(pane1, pane2);
        
        
        
        stage.setScene(scn);
        stage.setTitle("Calculator");
        stage.setWidth(150);
        stage.setHeight(200);
        stage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(CalculadoraEventos.class, args);
    }
	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
}