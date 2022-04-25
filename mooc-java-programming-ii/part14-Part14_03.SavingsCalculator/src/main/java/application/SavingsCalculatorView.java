package application;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class SavingsCalculatorView {

    private SavingsCalculatorLogic calculatorWithInterestRate;
    private SavingsCalculatorLogic calculatorWithoutInterestRate;

    public SavingsCalculatorView(SavingsCalculatorLogic calculatorWithInterestRate,
            SavingsCalculatorLogic calculatorWithoutInterestRate) {
        this.calculatorWithInterestRate = calculatorWithInterestRate;
        this.calculatorWithoutInterestRate = calculatorWithoutInterestRate;
    }

    public Parent getView() {

        BorderPane layout = new BorderPane();

        NumberAxis xAxis = new NumberAxis(0, calculatorWithInterestRate.getYearsOfSaving(), 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calculator");
        lineChart.setAnimated(false);

        VBox slidersView = new VBox(25);

        BorderPane upperSliderLayout = new BorderPane();
        Label upperLabel = new Label("Monthly savings");
        Slider upperSlider = new Slider(25, 250, 5);
        upperSlider.setShowTickMarks(true);
        upperSlider.setShowTickLabels(true);
        upperSlider.setMajorTickUnit(25);
        upperSlider.setValue(calculatorWithInterestRate.getMonthlySavings());
        Double upperSliderValueDouble = upperSlider.getValue();
        Label upperSliderValueLabel = new Label(upperSliderValueDouble.toString());

        upperSliderLayout.setLeft(upperLabel);
        upperSliderLayout.setCenter(upperSlider);
        upperSliderLayout.setRight(upperSliderValueLabel);

        BorderPane lowerSliderLayout = new BorderPane();
        Label lowerLabel = new Label("Yearly interest rate");
        Slider lowerSlider = new Slider(0, 10, 2);
        lowerSlider.setShowTickMarks(true);
        lowerSlider.setMajorTickUnit(10);
        lowerSlider.setShowTickLabels(true);
        Double lowerSliderValueDouble = lowerSlider.getValue();
        Label lowerSliderValueLabel = new Label(lowerSliderValueDouble.toString());

        XYChart.Series<Number, Number> savingsWithoutInterestRate = new XYChart.Series<>();
        XYChart.Series<Number, Number> savingsWithInterestRate = new XYChart.Series<>();

        upperSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                savingsWithInterestRate.getData().clear();
                savingsWithoutInterestRate.getData().clear();

                upperSliderValueLabel.setText(String.format("%.1f", newValue));
                System.out.println(newValue);

                calculatorWithInterestRate.setMonthlySavings((Double) newValue);
                calculatorWithInterestRate.calculateSavingsAfterAYears().entrySet().forEach((pair) -> {
                    savingsWithInterestRate.getData()
                            .add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
                });

                calculatorWithoutInterestRate.setMonthlySavings((Double) newValue);
                calculatorWithoutInterestRate.calculateSavingsAfterAYears()
                        .entrySet().forEach((pair) -> {
                            savingsWithoutInterestRate.getData()
                                    .add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
                        });
            }
        });

        lowerSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                savingsWithInterestRate.getData().clear();

                lowerSliderValueLabel.setText(String.format("%.1f", newValue));
                calculatorWithInterestRate.setYearlyInterestRate((Double) newValue);
                System.out.println(newValue);
                calculatorWithInterestRate.calculateSavingsAfterAYears().entrySet().forEach((pair) -> {
                    savingsWithInterestRate.getData()
                            .add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
                });

            }
        });

        calculatorWithInterestRate.calculateSavingsAfterAYears().entrySet().forEach((pair) -> {
            savingsWithInterestRate.getData().add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
        });
        calculatorWithoutInterestRate.calculateSavingsAfterAYears().entrySet().forEach((pair) -> {
            savingsWithoutInterestRate.getData().add(new XYChart.Data<Number, Number>(pair.getKey(), pair.getValue()));
        });

        lineChart.getData().add(savingsWithoutInterestRate);
        lineChart.getData().add(savingsWithInterestRate);

        lowerSliderLayout.setLeft(lowerLabel);
        lowerSliderLayout.setCenter(lowerSlider);
        lowerSliderLayout.setRight(lowerSliderValueLabel);

        slidersView.getChildren().addAll(upperSliderLayout, lowerSliderLayout);

        layout.setCenter(lineChart);
        layout.setTop(slidersView);
        layout.setPadding(new Insets(40, 15, 15, 15));

        return layout;

    }
}
