package Exercicio11;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaCalculadora extends Application {
    public void start(Stage stage){
    	
        VBox pane = new VBox();
        HBox pane1 = new HBox();
        GridPane pane2 = new GridPane();
        Scene scn = new Scene(pane);
        
        Button btnCE = new Button("CE");
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnSoma = new Button("+");
        Button btnSubt = new Button("-");
        Button btnMult = new Button("*");
        Button btnDiv = new Button("/");
        Button btnVirg = new Button(",");
        Button btnIgual = new Button("=");
        TextField textVisor = new TextField();
        
        textVisor.setPrefWidth(100);
        

        pane1.getChildren().addAll(textVisor, btnCE);
        

        pane2.add(btn1, 0,0);
        pane2.add(btn2, 1,0);
        pane2.add(btn3, 2,0);
        pane2.add(btnSoma, 3,0);
        pane2.add(btn4, 0,1);
        pane2.add(btn5, 1,1);
        pane2.add(btn6, 2,1);
        pane2.add(btnSubt, 3,1);
        pane2.add(btn7, 0,2);
        pane2.add(btn8, 1,2);
        pane2.add(btn9, 2,2);
        pane2.add(btnMult, 3,2);
        pane2.add(btnVirg, 0,3);
        pane2.add(btn0, 1,3);
        pane2.add(btnIgual, 2,3);
        pane2.add(btnDiv, 3,3);
        
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
        Application.launch(TelaCalculadora.class, args);
    }
}