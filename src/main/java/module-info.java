module com.example.windowmonitormatrix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.windowmonitormatrix to javafx.fxml;
    exports com.example.windowmonitormatrix;
}