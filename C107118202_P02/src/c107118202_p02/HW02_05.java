package c107118202_p02;

import java.util.Scanner;

public class HW02_05 {

    public static void main(String[] args) {
        int year;
        Scanner sca = new Scanner(System.in);
        System.out.println("判斷是否為閏年leap year，請輸入年份：");
        year = sca.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("是閏年Is a leap year");
        } else {
            System.out.println("不是閏年Not a leap year");
        }
    }

}
