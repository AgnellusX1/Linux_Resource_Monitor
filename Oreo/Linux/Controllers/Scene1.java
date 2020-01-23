package Linux.Controllers;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import Linux.Main;

import java.io.IOException;




public class Scene1 {

    @FXML
    private AnchorPane Scene1;

    @FXML
    private Label label;

    @FXML
    private Button start;

    @FXML
    private Button credit;

    @FXML
    private Button help;

    @FXML
    private Button exit;

    @FXML
    Parent root;

    @FXML
    void onCredit(ActionEvent event) {

    }

    @FXML
    void onExit(ActionEvent event) {
        Platform.exit();
        System.exit(0);

    }



    @FXML
    void onHelp(ActionEvent event) {

    }

    Alert alert=new Alert(Alert.AlertType.NONE);

    @FXML
    void onStart(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Linux/Fxml/Scene2.fxml"));
            Stage stage2 = Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onCredits(ActionEvent event){
        alert.setAlertType(Alert.AlertType.INFORMATION);
        alert.setTitle("Developers");
        alert.setHeight(100);
        alert.setWidth(200);
        alert.setHeaderText(null);
        alert.setContentText("Agnellus Fernandes" +
                "Anisha Fernandes" +
                "Clarice D'silva");
        alert.showAndWait();
    }







}