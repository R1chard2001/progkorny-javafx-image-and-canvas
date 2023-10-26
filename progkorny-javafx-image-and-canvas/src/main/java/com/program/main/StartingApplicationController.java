package com.program.main;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartingApplicationController {
    public void initialize() {
        showCanvasExampleButton.setOnAction(this::showCanvasExampleButton);
        showImageExampleButton.setOnAction(this::showImageExampleButtonOnAction);
    }
    private void showImageExampleButtonOnAction(ActionEvent event) {
        showImageExampleButton.setDisable(true);
        ImageApplication imageApp = new ImageApplication();
        try {
            imageApp.start(new Stage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        showImageExampleButton.setDisable(false);
    }
    private void showCanvasExampleButton(ActionEvent event) {
        showCanvasExampleButton.setDisable(true);
        CanvasApplication canvasApp = new CanvasApplication();
        try {
            canvasApp.start(new Stage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        showCanvasExampleButton.setDisable(false);
    }
    public Button showImageExampleButton;
    public Button showCanvasExampleButton;
}
