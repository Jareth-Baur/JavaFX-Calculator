/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.jareth;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Jareth Baur
 */
public class JavaFXCalculator extends Application {

    public static void main(String[] args) {
        launch(args);  // Start the JavaFX application
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));

        // Create a Scene with the loaded FXML file
        Scene scene = new Scene(root);

        // Set the title of the Stage (window)
        stage.setTitle("JavaFX Calculator");

        // Set the scene to the stage and show it
        stage.setScene(scene);
        stage.show();
    }
}
