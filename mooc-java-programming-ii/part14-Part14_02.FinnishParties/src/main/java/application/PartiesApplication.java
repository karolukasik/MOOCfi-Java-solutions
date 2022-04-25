package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Map;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String[] years = new String[12];
        List<String[]> partiesDatas = new ArrayList<>();

        readDataFromFileToLists("partiesdata.tsv", years, partiesDatas);

        NumberAxis yAxis = new NumberAxis();
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);

        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        Map<String, Map<Integer, Double>> values = new HashMap<>();
        Map<Integer, Double> temporaryMap = new HashMap<>();
        for (int i = 0; i < partiesDatas.size(); i++) {
            for (int j = 1; j < partiesDatas.get(i).length; j++) {
                if (partiesDatas.get(i)[j].equals("-")) {
                    continue;
                }
                temporaryMap.put(Integer.valueOf(years[j]), Double.valueOf(partiesDatas.get(i)[j]));
            }
            values.put(partiesDatas.get(i)[0], temporaryMap);
            temporaryMap = new HashMap<>();
        }

        values.keySet().stream().forEach((party) -> {
            XYChart.Series<Number, Number> data = new XYChart.Series<>();
            {
                data.setName(party);
                values.get(party).entrySet()
                        .forEach((pair) -> {
                            data.getData().add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
                        });
                lineChart.getData().add(data);
            }
            ;
        });
        Scene view = new Scene(lineChart, 640, 480);
        primaryStage.setScene(view);
        primaryStage.show();
    }

    private static void readDataFromFileToLists(String fileName, String[] arrayForXAxis,
            List<String[]> listForOtherData) {
        try (Scanner scanner = new Scanner(Paths.get("partiesdata.tsv"))) {
            int numberOfFileRow = 1;
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                if (numberOfFileRow == 1) {
                    String[] parts = row.split("\t");
                    System.arraycopy(parts, 0, arrayForXAxis, 0, arrayForXAxis.length);
                    numberOfFileRow++;
                } else {
                    String[] parts = row.split("\t");
                    listForOtherData.add(parts);
                }
            }

        } catch (

        Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
