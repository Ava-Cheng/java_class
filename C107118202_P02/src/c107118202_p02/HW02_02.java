package c107118202_p02;

import java.util.Scanner;

public class HW02_02 {

    public static void main(String[] args) {
        int num;
        System.out.println("判斷是偶數或是奇數，判斷是否為小於 10 之偶數\n請輸入一個數：");
        Scanner sca = new Scanner(System.in);
        num = sca.nextInt();
        if (num % 2 == 0) {
            if (num < 10) {
                System.out.printf("你輸入的數為%d，是小於10的偶數！！", num);
            } else {
                System.out.printf("你輸入的數為%d，是偶數，但大於等於10！！", num);
            }
        } else {
            System.out.printf("你輸入的數為%d，是奇數！！", num);
        }

    }

}
