package com.example.snakeandladder;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {

    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        root=new Group();
        GamePage p=new GamePage();
        root.getChildren().add(p.root);
        Scene scene = new Scene(root, 800, 500);
        stage.setTitle("Snake And Ladder!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}