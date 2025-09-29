package com.example.actividad2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField pantalla;
    private Calculator calculator;
    private boolean startNumber = true;
    private double num1;
    private String operador = "";

    @FXML
    private void initialize() {
        calculator = new Calculator();
    }

    @FXML
    private void procesarNumeros(ActionEvent evento) {
        String numeroPresionado = ((Button) evento.getSource()).getText();
        System.out.println(numeroPresionado);
        if (startNumber || pantalla.getText().equals("0")) {
            pantalla.setText(numeroPresionado);
        } else {
            pantalla.setText(pantalla.getText() + numeroPresionado);
        }
        startNumber = false;
    }

    @FXML
    private void procesarOperadores(ActionEvent evento) {
        String operadorPresionado = ((Button) evento.getSource()).getText();
        System.out.println(operadorPresionado);
        if (operadorPresionado.equals("=")) {
            if (operador.isEmpty()) {
                return;
            }
            double number2 = Double.parseDouble(pantalla.getText());
            double result = calculator.calculate(num1, number2, operador);
            pantalla.setText(String.format("%.0f", result));
            operador = "";
        } else {
            if (! operador.isEmpty()) {
                return;
            }
            num1 = Double.parseDouble(pantalla.getText());
            operador = operadorPresionado;
            startNumber = true;
        }
    }
}
