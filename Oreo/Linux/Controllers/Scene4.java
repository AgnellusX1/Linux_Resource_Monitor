package Linux.Controllers;
import Linux.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Scene4 implements Initializable {

    @FXML
    private Label memory;

    @FXML
    private Button back2;

    @FXML
    private Button kill2;

    @FXML
    private LineChart<String,Number> cpugraph;
    XYChart.Series<String,Number>series,series1,series2,series3;

    @FXML
    private CategoryAxis time;

    @FXML
    private NumberAxis usage;

    @FXML
    Parent root;

    @FXML
    private Button refresh;


    @FXML
    void onRefresh(ActionEvent event){

    }

    @FXML
    void onMenu(ActionEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/Oreo/java/Fxml/Scene2.fxml"));
            Stage stage2 =  Main.stage;
            stage2.setScene(new Scene(root));
            stage2.setResizable(false);
            stage2.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        series = new XYChart.Series<>();
        series.setName("Core 0");
        series1 = new XYChart.Series<>();
        series1.setName("Core 1");
        series2 = new XYChart.Series<>();
        series2.setName("Core 2");
        series3 = new XYChart.Series<>();
        series3.setName("Core 3");

        cpugraph.getData().add(series);
        cpugraph.getData().add(series1);
        cpugraph.getData().add(series2);
        cpugraph.getData().add(series3);

        Thread th = new Thread(new TemperatureReader());
        th.start();
    }

    class TemperatureReader implements Runnable {

        @Override
        public void run() {
            try {
                int ctr = 1;
                while (true) {

                    Pattern p = Pattern.compile("[+]....");

                    Process proc = Runtime.getRuntime().exec("sensors");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

                    String line = "";
                    int coreNumber = 0;

                    while ((line = reader.readLine()) != null) {
                        Matcher m = p.matcher(line);
                        if (m.find()) {
                            System.out.println("Match Found = " + m.group().substring(1));
                            Double temp = Double.parseDouble(m.group().substring(1));
                            switch (coreNumber++) {
                                case 0:
                                    series.getData().add(new XYChart.Data<>(ctr + "", temp));
                                    break;
                                case 1:
                                    series1.getData().add(new XYChart.Data<>(ctr + "", temp));
                                    break;
                                case 2:
                                    series2.getData().add(new XYChart.Data<>(ctr + "", temp));
                                    break;
                                case 3:
                                    series3.getData().add(new XYChart.Data<>(ctr + "", temp));
                                    break;
                            }

                        }
                    }
                    ctr++;
                    System.out.println("-----------------------------");
                    Thread.sleep(2000);
                }
            } catch (Exception ex) {
                Logger.getLogger(Scene4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
