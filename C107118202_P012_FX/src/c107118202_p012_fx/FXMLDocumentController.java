/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c107118202_p012_fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author yucun
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private Button food0;
    @FXML
    private Button food0m;
    @FXML
    private TextArea display;
    @FXML
    private TextField sum;
    @FXML
    private Button clear;
    @FXML
    private Button food3;
    @FXML
    private Button food3m;
    @FXML
    private Button food2;
    @FXML
    private Button food2m;
    @FXML
    private Button food1;
    @FXML
    private Button food1m;
    @FXML
    private CheckBox discount;
    String[][] menu = {
        {"A10", "牛肉漢堡套餐", "200"},
        {"A11", "起司漢堡", "80"},
        {"A12", "香脆薯條", "50"},
        {"A13", "可樂", "30"}};
    OrderModel model = new OrderModel(menu);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void addOne(ActionEvent event) {
        Button btn = (Button) event.getSource();
        switch (btn.getId()) {
            case "food0":
                model.add1(0);
                break;
            case "food1":
                model.add1(1);
                break;
            case "food2":
                model.add1(2);
                break;
            case "food3":
                model.add1(3);
                break;
        }
        model.check(display, sum);
    }

    @FXML
    private void clear(ActionEvent event) {
        display.setText("");
        sum.setText("");
        model.clear_order();
    }

    @FXML
    private void minusOne(ActionEvent event) {
        Button btn = (Button) event.getSource();
        switch (btn.getId()) {
            case "food0m":
                model.minus1(0);
                break;
            case "food1m":
                model.minus1(1);
                break;
            case "food2m":
                model.minus1(2);
                break;
            case "food3m":
                model.minus1(3);
                break;
        }
        model.check(display, sum);
    }

    @FXML
    private void discount(ActionEvent event) {
        model.discount();
        model.check(display, sum);
    }

}
