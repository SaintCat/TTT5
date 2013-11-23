package ru.tictactoe.client;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> BetColumn;

    @FXML
    private TextArea ChatArea;

    @FXML
    private Button ChatButton;

    @FXML
    private TextField ChatField;

    @FXML
    private TableColumn<?, ?> GameNameColumn;

    @FXML
    private Button LoginButton;

    @FXML
    private Button PlayButton;

    @FXML
    private TableColumn<?, ?> PlayersColumn;

    @FXML
    private Button QuitButton;

    @FXML
    private TableColumn<?, ?> StatusColumn;


    @FXML
    void initialize() {
        assert BetColumn != null : "fx:id=\"BetColumn\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert ChatArea != null : "fx:id=\"ChatArea\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert ChatButton != null : "fx:id=\"ChatButton\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert ChatField != null : "fx:id=\"ChatField\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert GameNameColumn != null : "fx:id=\"GameNameColumn\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert LoginButton != null : "fx:id=\"LoginButton\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert PlayButton != null : "fx:id=\"PlayButton\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert PlayersColumn != null : "fx:id=\"PlayersColumn\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert QuitButton != null : "fx:id=\"QuitButton\" was not injected: check your FXML file 'MenuGUI.fxml'.";
        assert StatusColumn != null : "fx:id=\"StatusColumn\" was not injected: check your FXML file 'MenuGUI.fxml'.";
    }

}

