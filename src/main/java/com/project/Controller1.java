package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class Controller1 {

    @FXML
    private Text lblMessage;

    public void updateMessage() {
        lblMessage.setText("Hola " + Main.name + ", tienes " + Main.age + " años.");
    }

    @FXML
    private void goBack(ActionEvent event) {
        UtilsViews.setView("Formulario");
    }
}