module com.program.progkornyjavafximageandcanvas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.program.main to javafx.fxml;
    exports com.program.main;
}