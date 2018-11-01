package c107118202_p02;

import java.util.Scanner;

public class HW02_01 {

    public static void main(String[] args) {
        float score;
        String str;
        System.out.println("成績等第列印\n請輸入您的成績：");
        Scanner sca = new Scanner(System.in);
        score = sca.nextFloat();
        if (score <= 59) {
            str = "F";
        } else if (score <= 69) {
            str = "D";
        } else if (score <= 79) {
            str = "C";
        } else if (score <= 89) {
            str = "B";
        } else {
            str = "A";
        }
        System.out.printf("您的分數%.1f分，成績等第為：%s\n", score, str);
    }

}
