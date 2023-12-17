module com.example.matrixmultiplication {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matrixmultiplication to javafx.fxml;
    exports com.example.matrixmultiplication;
}