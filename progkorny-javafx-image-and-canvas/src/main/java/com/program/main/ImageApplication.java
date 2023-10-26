package com.program.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ImageApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(StartingApplication.class.getResource("image-application.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Image view window");
        stage.setScene(scene);
        stage.setWidth(500);
        stage.setHeight(400);
        stage.setMinWidth(500);
        stage.setMinHeight(400);
        stage.showAndWait();
    }
}
