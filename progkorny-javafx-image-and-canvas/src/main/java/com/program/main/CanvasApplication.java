package com.program.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CanvasApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartingApplication.class.getResource("canvas-application.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Canvas window");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(400);
        stage.setMinWidth(500);
        stage.setMinHeight(400);
        stage.showAndWait();
    }
}
