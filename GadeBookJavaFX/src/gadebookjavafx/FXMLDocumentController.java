/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadebookjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextArea input;
    @FXML
    private TextArea output;
    @FXML
    private Button btn_in;
    @FXML
    private Button btn_avg;
    @FXML
    private Button btn_ascend;

    GradeBook gb;
    @FXML
    private Label label;
    @FXML
    private Button btn_descend;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        gb = new GradeBook();
    }

    @FXML
    private void set_input(ActionEvent event) {
        String msg = String.format("輸入資料:\n%s\n", input.getText());
        output.setText(msg);
        gb.setGrades(input.getText());
    }

    @FXML
    private void avg(ActionEvent event) {
        String msg = String.format("計算平均結果:%.2f\n", gb.getAvg());
        output.appendText(msg);
    }

    @FXML
    private void sort_ascend(ActionEvent event) {
        gb.sortAscend();
        output.appendText("遞增排序結果:"+gb.getAllGrades());
    }

    @FXML
    private void ort_descend(ActionEvent event) {
        gb.sortDescend();
        output.appendText("遞減排序結果:"+gb.getAllGrades());
    }

}
