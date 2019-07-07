import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class Box {

    public VBox showBox() {

        TextField field = new TextField();
        TextField textfield = new TextField();
        Button button = new Button("Wyślij");
        textfield.setId("textfield");

        Label label = new Label("Błąd");
        label.setVisible(false);
        label.setStyle("color: red;");

        VBox box = new VBox();
        box.setSpacing(50);
        box.setPadding(new Insets(20, 20, 20, 20));
        box.getChildren().addAll(field, textfield, label, button);

        button.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            if (field.getText().isEmpty() || textfield.getText().isEmpty()) {
                label.setVisible(true);
            } else {
                label.setVisible(false);
            }
        });

        return box;
    }
}