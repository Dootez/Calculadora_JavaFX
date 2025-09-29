package com.example.actividad2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(CalculatorApp.class.getResource("calculator-view.fxml"));
        stage.setTitle("Calculadora - Eneko");
        stage.setResizable(false);
        stage.setScene(new Scene(root));
        stage.show();
    }

}
