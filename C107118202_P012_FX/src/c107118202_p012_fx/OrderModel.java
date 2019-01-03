package c107118202_p012_fx;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class OrderModel {

    String[][] menu;
    int[] qty;
    boolean discount = false;
    double discount_rate = 0.9;

    public OrderModel(String[][] m) {
        menu = m;
        qty = new int[m.length];
    }

    public void add1(int idx) {
        qty[idx] += 1;
    }

    public void minus1(int idx) {
        if (qty[idx] > 0) {
            qty[idx] -= 1;
        }
    }

    public void discount() {
        discount = !discount;
    }

    public void discount(double rate) {
        discount = true;
        discount_rate = rate;
    }

    public void check() {
        int total = 0;
        for (int i = 0; i < qty.length; i++) {
            if (qty[i] != 0) {
                total += qty[i] * Integer.parseInt(menu[i][2]);
                System.out.printf("%s: %s*%d\n", menu[i][1], menu[i][2], qty[i]);
            }
        }
        System.out.println("--總金額:" + total);
        if (discount) {
            System.out.printf("--打%.2f 折，折扣後金額:%d\n", discount_rate, (int) (total * discount_rate));
        }
    }

    public void check(TextArea display, TextField sum) {
        display.setText("");
        int total = 0;
        for (int i = 0; i < qty.length; i++) {
            if (qty[i] != 0) {
                total += qty[i] * Integer.parseInt(menu[i][2]);
                String msg = String.format("%s: %s*%d\n", menu[i][1], menu[i][2], qty[i]);
                display.appendText(msg);
            }
        }
        String msg1 = String.format("--總金額:%d\n", total);
        String msg2 = String.format("$%d", total);
        display.appendText(msg1);
        sum.setText(msg2);
        if (discount) {
            int new_total = (int) (total * discount_rate);
            String msg3 = String.format("$%d", new_total);
            sum.setText(msg3);
            String msg4 = String.format("--打%.2f 折，折扣後金額:%d\n", discount_rate, new_total);
            display.appendText(msg4);
        }
    }

    public void clear_order() {
        for (int i = 0; i < qty.length; i++) {
            qty[i] = 0;
        }
    }
}
