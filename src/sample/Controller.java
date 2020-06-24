package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public Button btn1;
    @FXML
    public Button btn2;
    @FXML
    public Button btn3;
    @FXML
    public Button btn4;
    @FXML
    public Button btn5;
    @FXML
    public Button btn6;
    @FXML
    public Button btn7;
    @FXML
    public Button btn8;
    @FXML
    public Button btn9;
    @FXML
    public Button btn0;
    @FXML
    public Button btnComma;
    @FXML
    public Button btnPlus;
    @FXML
    public Button btnMinus;
    @FXML
    public Button btnMultiply;
    @FXML
    public Button btnDivision;
    @FXML
    public Button btnSQRT;
    @FXML
    public Button btnEquation;
    @FXML
    public Button btnClear;
    @FXML
    public TextField textField;



    public void getSQRT(ActionEvent actionEvent) {
    }

    public void getResult(ActionEvent actionEvent) {
    }

    public void add1(ActionEvent actionEvent) {
        textField.appendText(btn1.getText());
    }

    public void add2(ActionEvent actionEvent) {
        textField.appendText(btn2.getText());
    }

    public void add3(ActionEvent actionEvent) {
        textField.appendText(btn3.getText());
    }

    public void add4(ActionEvent actionEvent) {
        textField.appendText(btn4.getText());
    }

    public void add5(ActionEvent actionEvent) {
        textField.appendText(btn5.getText());
    }

    public void add6(ActionEvent actionEvent) {
        textField.appendText(btn6.getText());
    }


    public void add7(ActionEvent actionEvent) {
        textField.appendText(btn7.getText());
    }

    public void add8(ActionEvent actionEvent) {
        textField.appendText(btn8.getText());
    }

    public void add9(ActionEvent actionEvent) {
        textField.appendText(btn9.getText());
    }

    public void add0(ActionEvent actionEvent) {
        textField.appendText(btn0.getText());
    }

    public void addComma(ActionEvent actionEvent) {
        textField.appendText(btnComma.getText());
    }

    public void addPlus(ActionEvent actionEvent) {
        textField.appendText(btnPlus.getText());
    }

    public void addMinus(ActionEvent actionEvent) {
        textField.appendText(btnMinus.getText());
    }

    public void addMultiply(ActionEvent actionEvent) {
        textField.appendText(btnMultiply.getText());
    }

    public void addDivision(ActionEvent actionEvent) {
        textField.appendText(btnDivision.getText());
    }

    public void clearTextArea(ActionEvent actionEvent) {
        textField.clear();
    }

    public void exitClick(ActionEvent actionEvent) {
        Stage stage = (Stage) textField.getScene().getWindow();
        stage.close();
    }

    public void unsupported(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Внимание!");
        alert.setHeaderText("Сообщение системы: ");
        alert.setContentText("К сожалению, функция пока не работает!");

        alert.showAndWait();
    }
}
