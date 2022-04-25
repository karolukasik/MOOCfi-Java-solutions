package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        SavingsCalculatorLogic calculatorWithInterestRate = new SavingsCalculatorLogic(2);
        SavingsCalculatorLogic calculatorWithoutInterestRate = new SavingsCalculatorLogic();
        SavingsCalculatorView layout = new SavingsCalculatorView(calculatorWithInterestRate,
                calculatorWithoutInterestRate);
        Scene view = new Scene(layout.getView(), 640, 480);
        window.setScene(view);
        window.show();

    }

}
