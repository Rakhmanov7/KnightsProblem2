module com.example.knightsproblem2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.example.knightsproblem2 to javafx.fxml;
    exports com.example.knightsproblem2;
}