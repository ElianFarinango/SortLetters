module com.example.flowcharttocodesortletters {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flowcharttocodesortletters to javafx.fxml;
    exports com.example.flowcharttocodesortletters;
}