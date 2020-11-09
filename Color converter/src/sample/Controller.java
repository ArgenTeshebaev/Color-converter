package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField rTextField;
    @FXML
    private TextField gTextField;
    @FXML
    private TextField bTextField;
    @FXML
    private Button convertButton;
    @FXML
    private Label hexLabel;

    public Controller() {
    }

    @FXML
    void initialize() {
    }

    public void converting() {
        ConverterClass converter = new ConverterClass();
        String rS = this.rTextField.getText();
        String gS = this.gTextField.getText();
        String bS = this.bTextField.getText();
        if (!rS.isEmpty() && !rS.isBlank() && !gS.isEmpty() && !gS.isBlank() && !bS.isEmpty() && !bS.isBlank()) {
            if (!rS.contains("QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,./?qwertyuiopasdfghjklzxcvbnm") && !gS.contains("QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,./?qwertyuiopasdfghjklzxcvbnm") && !bS.contains("QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,./?qwertyuiopasdfghjklzxcvbnm")) {
                double r = Double.parseDouble(rS);
                double g = Double.parseDouble(gS);
                double b = Double.parseDouble(bS);
                converter.setR(r);
                converter.setG(g);
                converter.setB(b);
                String answer = converter.getHexCode();
                this.hexLabel.setText(answer);
            } else {
                this.hexLabel.setText("Write just numbers.");
            }
        } else {
            this.hexLabel.setText("Write values.");
        }

    }
}