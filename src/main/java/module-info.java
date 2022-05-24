module com.example.spellingbeeproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.spellingbeeproject to javafx.fxml;
    exports com.example.spellingbeeproject;
}