/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c107118202_p09_fx;

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
    private TextField hight;
    @FXML
    private TextField wight;
    @FXML
    private TextField bmi_value;
    @FXML
    private TextArea suggest;
    @FXML
    private Button btn;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void count(ActionEvent event) {
        int h=Integer.parseInt(hight.getText());
        int w=Integer.parseInt(wight.getText());
        BMI bmi_val = new BMI(h, w);
        String result=String.format("%.2f",bmi_val.GetBmi());
        String result_suggest=String.format("%s",bmi_val.suggest());
        bmi_value.setText(result);
        suggest.setText(result_suggest);
    }
    
}
