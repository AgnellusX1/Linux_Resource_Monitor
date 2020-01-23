package Linux;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage stage;
    Parent root;

    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        root = FXMLLoader.load(getClass().getResource("/Linux/Fxml/Scene1.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
