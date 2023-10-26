package com.program.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartingApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StartingApplication.class.getResource("starting-application.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Starting window");
        stage.setScene(scene);
        stage.show();
        stage.setMinWidth(stage.getWidth());
        stage.setMinHeight(stage.getHeight());
    }

    public static void main(String[] args) {
        launch();
    }
}