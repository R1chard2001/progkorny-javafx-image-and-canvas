package com.program.main;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;

public class CanvasApplicationController {
    public Button clearCanvasButton;

    public void initialize() {
        canvas.getGraphicsContext2D().setFill(Paint.valueOf("#FFFFFF"));
        canvas.setWidth(2);
        canvas.setWidth(450);
        canvas.setHeight(300);
        canvas.getGraphicsContext2D().fillRect(0,0,canvas.getWidth(), canvas.getHeight());

        canvas.setOnMouseDragged(this::canvasOnMouseDragged);
        canvas.setOnMousePressed(this::canvasOnMousePressed);
        clearCanvasButton.setOnAction(this::clearCanvasButtonOnAction);
    }
    private void clearCanvasButtonOnAction(ActionEvent event) {
        canvas.getGraphicsContext2D().fillRect(0,0,canvas.getWidth(), canvas.getHeight());
    }
    double prevY, prevX;
    private void canvasOnMousePressed(MouseEvent event) {
        if (event.getButton() == MouseButton.PRIMARY) {
            prevX = event.getX();
            prevY = event.getY();
        }
    }
    private void canvasOnMouseDragged(MouseEvent event) {
        if (event.isPrimaryButtonDown()) {
            double x = event.getX(), y = event.getY();
            canvas.getGraphicsContext2D().setStroke(colorPicker.getValue());
            canvas.getGraphicsContext2D().strokeLine(prevX, prevY, x, y);
            prevX = x;
            prevY = y;
        }
    }
    public ColorPicker colorPicker;
    public Canvas canvas;
}
