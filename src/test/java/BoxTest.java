
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class BoxTest extends ApplicationTest {

    @Override
    public void start(Stage primaryStage) {
        Parent sceneRoot = new Box().showBox();
        primaryStage.setScene(new Scene(sceneRoot, 300, 400));
        primaryStage.show();
    }

    @Test
    public void should_contain_button_text() {
        // expect:
        verifyThat(".button", hasText("Wyślij"));
    }

    @Test
    public void should_contain_label_text() {
        // expect:
        verifyThat(".label", hasText("Błąd"));
    }

    @Test
    public void should_show_Błąd_when_clicked() {
        write("aaaaaaaaaa");
        clickOn(".button");
        verifyThat(".label", Node::isVisible);
    }

    @Test (expected = AssertionError.class)
    public void should_not_show_Błąd_when_clicked() {
        write("aaaaaaaaaa");
        clickOn("#textfield").write("bbbbbbbbbbb");
        clickOn(".button");
        verifyThat(".label", Node::isVisible);
    }
}
