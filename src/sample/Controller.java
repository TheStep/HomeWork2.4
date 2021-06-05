package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea mainTextArea;
    @FXML
    TextField mainTextField;

    public void clickMeBtnAction() {
        if (!mainTextField.getText().trim().isEmpty()) {
            mainTextArea.appendText(mainTextField.getText() + "\n");
            mainTextField.clear();
        }
    }
}
