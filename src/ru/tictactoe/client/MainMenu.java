package ru.tictactoe.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 */

public class MainMenu extends Application{
    @Override
    public void start(Stage primarystage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MenuGUI.fxml"));
        primarystage.setResizable(false);
        primarystage.setTitle("Tic-Tac-Toe game");
        primarystage.setScene(new Scene(root, 800, 600 /* TODO: dynamic*/));
        primarystage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
