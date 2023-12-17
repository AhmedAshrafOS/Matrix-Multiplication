package com.example.matrixmultiplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField TextField;
    @FXML
    private TextField TextFieldTwo;
    @FXML
    private Button submitButton;
    private Stage stage ;
    private Scene scene;
    private Parent root;
    @FXML
    public  void sumbitButton (ActionEvent event) throws IOException {

        int rows = Integer.parseInt(TextField.getText());
        int columns = Integer.parseInt(TextField.getText());


        String enteredText = TextField.getText();
        System.out.println("Entered text: " + enteredText);
        MatrixMain.switchToMatrixScene(rows, columns);

    }





}