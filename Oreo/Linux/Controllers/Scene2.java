package Linux.Controllers;

import Linux.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene2 {

    @FXML
    private Label click;

    @FXML
    private Button cpu;

    @FXML
    private Button traffic;

    @FXML
    private Button disk;

    @FXML
    private Button enable;

    @FXML
    private Button manual;

    @FXML
    private Button recent;

    @FXML
    private Label enabled;

    @FXML
    private Label used;

    @FXML
    private Button m3emory;

    @FXML
    Parent root;

    @FXML
    void onCpu(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("java/Fxml/Scene3.fxml"));
            Stage stage2 = Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void onMem(ActionEvent event) {

            try {
                root = FXMLLoader.load(getClass().getResource("/Linux/Fxml/Scene4.fxml"));
                Stage stage2 =  Main.stage;
                stage2.setScene(new Scene(root));
                stage2.setResizable(false);
                stage2.show();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
    @FXML
    void onIn(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Linux/Fxml/Scene5.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    @FXML
    void ondisk(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene6.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @FXML
    void onEn(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene7.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    @FXML
    void onMan(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene9.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @FXML
    void onRec(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene8.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



}




