package application;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) {
        NumberAxis xAxis = new NumberAxis("Year", 2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis("Ranking", 0, 100, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        lineChart.setLegendVisible(false);

        Map<Integer, Integer> datas = new HashMap<>();
        try (Scanner scanner = new Scanner(Paths.get("shanghai.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (row.isEmpty()) {
                    continue;
                }
                String[] parts = row.split(" ");
                datas.put(Integer.valueOf(parts[0]), Integer.valueOf(parts[1]));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        XYChart.Series<Number, Number> data = new XYChart.Series<>();

        data.getData().add(new XYChart.Data<>(2007, 73));
        data.getData().add(new XYChart.Data<>(2008, 68));
        data.getData().add(new XYChart.Data<>(2009, 72));
        data.getData().add(new XYChart.Data<>(2010, 72));
        data.getData().add(new XYChart.Data<>(2011, 74));
        data.getData().add(new XYChart.Data<>(2012, 73));
        data.getData().add(new XYChart.Data<>(2013, 76));
        data.getData().add(new XYChart.Data<>(2014, 73));
        data.getData().add(new XYChart.Data<>(2015, 67));
        data.getData().add(new XYChart.Data<>(2016, 56));
        data.getData().add(new XYChart.Data<>(2017, 56));

        // datas.keySet().stream().forEach((key) -> {
        // data.getData().add(new XYChart.Data<>(key, datas.get(key)));
        // });

        lineChart.getData().add(data);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

}
