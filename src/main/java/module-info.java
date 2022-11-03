module com.example.codesquad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codesquad to javafx.fxml;
    exports com.example.codesquad;
}