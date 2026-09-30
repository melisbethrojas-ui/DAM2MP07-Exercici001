package com.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller0 {

    @FXML 
    private TextField txtName;
    @FXML
    private TextField txtAge;
    @FXML
    private Button btnSubmit;

    @FXML
    private void checkInputs(){
        boolean isNameEmpty = txtName.getText().trim().isEmpty();
        boolean isAgeEmpty = txtAge.getText().trim().isEmpty();

        btnSubmit.setDisable(isNameEmpty || isAgeEmpty);
    }

    @FXML
    private void goToResults(ActionEvent event) {
        Main.name = txtName.getText().trim();
        Main.age = txtAge.getText().trim();

        Controller1 ctrl1 = (Controller1) UtilsViews.getController("Resultados");
        if (ctrl1 != null) {
            ctrl1.updateMessage();
        }

        UtilsViews.setView("Resultados");
    }

}