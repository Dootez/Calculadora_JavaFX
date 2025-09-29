module com.example.actividad2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.actividad2 to javafx.fxml;
    exports com.example.actividad2;
}