package Exercicio09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Calculadora extends Application {
    public void start(Stage stage){
    	
        Pane pane = new Pane();
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
        
        
        pane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
        							btnCE, btnSoma, btnSubt, btnMult, btnDiv,btnVirg, btnIgual, textVisor);
        
        
        btnCE.relocate(100, 0);
        btn1.relocate(0, 30);
        btn2.relocate(30, 30);
        btn3.relocate(60, 30);
        btnSoma.relocate(90, 30);
        btn4.relocate(0, 60);
        btn5.relocate(30, 60);
        btn6.relocate(60, 60);
        btnSubt.relocate(90, 60);
        btn7.relocate(0, 90);
        btn8.relocate(30, 90);
        btn9.relocate(60, 90);
        btnMult.relocate(90, 90);
        btnVirg.relocate(0, 120);
        btn0.relocate(30, 120);
        btnIgual.relocate(60, 120);
        btnDiv.relocate(90, 120);
        
        
        
        
        stage.setScene(scn);
        stage.setTitle("Calculator");
        stage.setWidth(150);
        stage.setHeight(200);
        stage.show();
        
    }
    public static void main(String[] args) {
        Application.launch(Calculadora.class, args);
    }
}