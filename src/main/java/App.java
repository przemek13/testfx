import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {

    public void start(Stage primaryStage) {
        VBox box = new Box().showBox();
        primaryStage.setTitle("TestowyFX");
        primaryStage.setScene(new Scene(box, 300, 400));
        primaryStage.show();
    }
}