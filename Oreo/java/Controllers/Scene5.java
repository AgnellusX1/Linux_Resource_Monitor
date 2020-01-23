package java.Controllers;

import java.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene5 {

    @FXML
    private Label internet;

    @FXML
    private Button back3;


    @FXML
    Parent root;

    @FXML
    void onMenu(ActionEvent event) {

        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene2.fxml"));
            Stage stage2 = Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

