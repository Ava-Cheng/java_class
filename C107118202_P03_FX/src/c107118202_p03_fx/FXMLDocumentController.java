/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c107118202_p03_fx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private TextField r;
    @FXML
    private TextArea display;
    
    Circle cir = new Circle();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void Length(ActionEvent event) {
        int radius=Integer.parseInt(r.getText());
        cir.setRadius(radius);
        String result=String.format("圓周長：%.2f\n",cir.getLength());
        display.appendText(result);
    }
    @FXML
    private void area(ActionEvent event) {
        int radius=Integer.parseInt(r.getText());
        cir.setRadius(radius);
        String result=String.format("圓面積：%.2f\n",cir.getArea());
        display.appendText(result);
    }
}
