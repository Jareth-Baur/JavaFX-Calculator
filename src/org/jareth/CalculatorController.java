/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.jareth;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jareth Baur
 */
public class CalculatorController {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        if (start) {
            display.clear(); // Clear the display on the first input
            start = false;
        }

        // Append the number clicked to the display
        String value = ((javafx.scene.control.Button) event.getSource()).getText();
        display.appendText(value);
    }

    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        // Store the first number and operator
        firstNumber = Double.parseDouble(display.getText());
        operator = ((javafx.scene.control.Button) event.getSource()).getText();
        display.clear();
    }

    @FXML
    private void handleEquals(javafx.event.ActionEvent event) {
        // Calculate the result based on the operator
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        display.setText(String.valueOf(result));
        start = true; // Reset for the next calculation
    }

    @FXML
    private void handleClear(javafx.event.ActionEvent event) {
        // Clear the display and reset the calculator
        display.clear();
        firstNumber = 0;
        operator = "";
        start = true;
    }
}
