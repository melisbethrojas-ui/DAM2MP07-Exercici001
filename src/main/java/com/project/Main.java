package com.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    final int WIDOW_WIDTH = 800;
    final int WINDOW_HEIGHT = 600;

    public static String name = " ";
    public static String age = " ";


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        UtilsViews.parentContainer.setStyle("-fx-font: 14 arial;");
        UtilsViews.addView(getClass(), "Formulario", "/assets/view0.fxml");
        UtilsViews.addView(getClass(), "Resultados", "/assets/view1.fxml");
        

        Scene scene = new Scene(UtilsViews.parentContainer);

        stage.setScene(scene);
        stage.setMinWidth(WIDOW_WIDTH);
        stage.setMinHeight(WINDOW_HEIGHT);
        stage.show();
        stage.setTitle("Formulario y Resultados");

        // Add icon only if not Mac
        if (!System.getProperty("os.name").contains("Mac")) {
            Image icon = new Image("file:/icons/icon.png");
            stage.getIcons().add(icon);
        }
    }
}