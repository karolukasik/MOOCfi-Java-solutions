package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parameters params = getParameters();
        String userTitle = params.getNamed().get("userTitle");

        primaryStage.setTitle(userTitle);
        primaryStage.show();
    }

}
