/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketorder;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {

    private Label label;
    @FXML
    private ComboBox<String> fromStation;
    @FXML
    private ChoiceBox toStation;
    @FXML
    private Button button_exchange;
    @FXML
    private Button button_price;
    @FXML
    private ChoiceBox<String> adult;
    @FXML
    private ChoiceBox<String> child;
    @FXML
    private ToggleGroup CarType;
    @FXML
    private DatePicker DepartureDate;
    @FXML
    private DatePicker ReturnDate;
    @FXML
    private RadioButton standard;
    @FXML
    private RadioButton business;
    @FXML
    private ChoiceBox<String> love;
    @FXML
    private ChoiceBox<String> oldMan;
    @FXML
    private RadioButton window;
    @FXML
    private ToggleGroup seat;
    @FXML
    private RadioButton aisle;
    @FXML
    private RadioButton no;
    @FXML
    private Button clearData;
    @FXML
    private Button resetbtn;

    @FXML
    private TextArea display;
    private String[] stations = {"台北", "台中", "嘉義", "左營"};
    private String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private int price[][] = {
        {0, 700, 1350, 1490},
        {700, 0, 650, 790},
        {1350, 650, 0, 140},
        {1490, 790, 140, 0}};

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //起迄站
        fromStation.setValue(stations[0]);
        fromStation.getItems().addAll("台北", "台中", "嘉義", "左營");
        for (int i = 0; i < stations.length; i++) {
            toStation.getItems().add(stations[i]);
        }
        toStation.setValue(stations[stations.length - 1]);
        //全票
        for (int i = 0; i < num.length; i++) {
            adult.getItems().add(num[i]);
        }
        adult.setValue(num[0]);
        //孩童票
        for (int i = 0; i < num.length; i++) {
            child.getItems().add(num[i]);
        }
        child.setValue(num[0]);
        //愛心票
        for (int i = 0; i < num.length; i++) {
            love.getItems().add(num[i]);
        }
        love.setValue(num[0]);
        //敬老票
        for (int i = 0; i < num.length; i++) {
            oldMan.getItems().add(num[i]);
        }
        oldMan.setValue(num[0]);
        //抓取今天日期
        DepartureDate.setValue(LocalDate.now());
        ReturnDate.setValue(LocalDate.now());
    }

    //起訖對調
    @FXML
    private void handleButtonAction_exchange(ActionEvent event) {
        int from = fromStation.getSelectionModel().getSelectedIndex();
        int to = toStation.getSelectionModel().getSelectedIndex();
        fromStation.getSelectionModel().select(to);
        toStation.getSelectionModel().select(from);
    }

    @FXML
    private void handleButtonAction_price(ActionEvent event) {
        int from = fromStation.getSelectionModel().getSelectedIndex();
        int to = toStation.getSelectionModel().getSelectedIndex();
        int adult_num = adult.getSelectionModel().getSelectedIndex();
        int child_num = child.getSelectionModel().getSelectedIndex();
        int love_num = love.getSelectionModel().getSelectedIndex();
        int oldMan_num = oldMan.getSelectionModel().getSelectedIndex();
        String seat_type = "";
        String car_type = "";
        String Return_date = "";
        String Departure_date = "";
        int adult_price = 0;
        int child_price = 0;
        int love_price = 0;
        int oldMan_price = 0;
        int amount = 0;
        int total = 0;

        //車廂種類
        if (standard.isSelected()) {
            amount = price[from][to];
            car_type = standard.getText();
        } else if (business.isSelected()) {
            amount = (int) (price[from][to] + 500);
            car_type = business.getText();
        }

        //座位喜好
        if (no.isSelected()) {
            seat_type = no.getText();
        } else if (window.isSelected()) {
            seat_type = window.getText();
        } else if (aisle.isSelected()) {
            seat_type = aisle.getText();
        }

        //票價計算
        adult_price = amount * Integer.valueOf(num[adult_num]);
        child_price = (int) (amount * Integer.valueOf(num[child_num]) * 0.5);
        love_price = (int) (amount * Integer.valueOf(num[love_num]) * 0.5);
        oldMan_price = (int) (amount * Integer.valueOf(num[oldMan_num]) * 0.5);
        total = adult_price + child_price + love_price + oldMan_price;

        //去程 and 回程時間取得
        String goingTime = DepartureDate.getValue().toString();
        String returnTime = ReturnDate.getValue().toString();
        if(!(returnTime.isEmpty())){
            display.setText("購票資訊：\n\t你還沒選擇票數喔！：）");
        }

        //顯示購票資訊
        if (total != 0 ) {
            String msg = String.format("購票資訊：\n\t起迄站：%s->%s \n\t車廂種類：%s\n\t座位喜好：%s\n\t去程時間：%s\t回程時間：%s\n\t票數：全票：%s，孩童票：%s，愛心票：%s，敬老票：%s\n", stations[from], stations[to], car_type, seat_type, goingTime, returnTime, num[adult_num], num[child_num], num[love_num], num[oldMan_num]);
            display.setText(msg);
            display.appendText("\t--------------------------------------------------------------\n");
            display.appendText(String.format("\t本次購票總金額：%d\t\t", total*2));

            //增加顯示購買日期
            Date dataNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            display.appendText("購票時間為: " + ft.format(dataNow));
        }
    }
    
    //清除購票資訊
    @FXML
    private void clear(ActionEvent event) {
        display.setText("");
    }

    //重設
    @FXML
    private void reset(ActionEvent event) {
        display.setText("");
        adult.setValue(num[0]);
        child.setValue(num[0]);
        love.setValue(num[0]);
        oldMan.setValue(num[0]);
        toStation.setValue(stations[stations.length - 1]);
        fromStation.setValue(stations[0]);
        no.setSelected(true);
        window.setSelected(false);
        aisle.setSelected(false);
        standard.setSelected(true);
        business.setSelected(false);
        DepartureDate.setValue(LocalDate.now());
    }

}
