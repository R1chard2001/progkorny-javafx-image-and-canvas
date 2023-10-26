package com.program.main;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageApplicationController {
    public void initialize() {
    selectFileButton.setOnAction(this::selectFileButtonOnAction);
    }
    private void selectFileButtonOnAction(ActionEvent event) {
        FileChooser fc = new FileChooser();
        ArrayList<String> extensions = new ArrayList<>(Arrays.asList("*.jpeg", "*.jpg", "*.png", "*.bmp"));
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", extensions));
        File file = fc.showOpenDialog(null);
        if (file != null) {
            filePathLabel.setText(file.getAbsolutePath());
            try {
                Image image = new Image(new FileInputStream(file));
                imageView.setImage(image);
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public Button selectFileButton;
    public Label filePathLabel;
    public ImageView imageView;
}
