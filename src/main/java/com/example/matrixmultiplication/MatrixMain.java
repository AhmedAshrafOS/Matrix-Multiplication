package com.example.matrixmultiplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        HelloApplication.stage = stage;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("ui.fxml"));
            Image image = new Image(getClass().getResource("ico.png").toURI().toString());
            Scene scene =new Scene(root);
            String css = this.getClass().getResource("ui.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.setTitle("Matrix Multiplication");
            stage.getIcons().add(image);
            stage.show();
        }
        catch (Exception e ){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

    public static void switchToMatrixScene(int rows, int columns) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("MatrixScene.fxml"));
            Parent root = loader.load();

            MatrixController matrixController = loader.getController();
            matrixController.initializeMatrix(rows, columns);

            stage.setScene(new Scene(root));
            stage.setTitle("Matrix Input - Step 2");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void switchToMatrixSceneTwo(int rows, int columns) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("MatrixSceneTwo.fxml"));
            Parent root = loader.load();

            MatrixController matrixController = loader.getController();
            matrixController.initializeMatrixTwo(rows, columns);

            stage.setScene(new Scene(root));
            stage.setTitle("Matrix Input - Step 3");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void switchToResultScene(String resultText) {
        try {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("ResultScene.fxml"));
            Parent root = loader.load();

            MatrixController resultController = loader.getController();
            resultController.setResultText(resultText);

            stage.setScene(new Scene(root));
            stage.setTitle("Result Scene");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}