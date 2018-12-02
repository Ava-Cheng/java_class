/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button buttonadd;
    @FXML
    private Label display;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add(ActionEvent event) {
        int n1=Integer.parseInt(num1.getText());
        int n2=Integer.parseInt(num2.getText());
        int ans=n1+n2;
        String result=String.format("%d+%d=%d",n1,n2,ans);
        display.setText(result);
        //System.out.println("+");
    }
    
}
