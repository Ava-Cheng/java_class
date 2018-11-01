package c107118202_p03;

import java.util.Scanner;

public class HW03_03 {

    public static void main(String[] args) {
        int num1, num2;
        int n = 1;
        int b = 0;
        Scanner sca = new Scanner(System.in);
        System.out.println("計算兩個數的最大公因數。\n請輸入第一個數字：");
        num1 = sca.nextInt();
        System.out.println("請輸入第二個數字：");
        num2 = sca.nextInt();
        while (n <= num1 & n <= num2) {
            if (num1 % n == 0 & num2 % n == 0) {
                b = n;
            }
            n += 1;
        }
        System.out.printf("%d和%d的最大公因數為%d", num1, num2, b);
    }

}
