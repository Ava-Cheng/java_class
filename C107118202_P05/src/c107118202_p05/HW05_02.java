package c107118202_p05;

import java.util.Scanner;

public class HW05_02 {

    public static String DecToBinary(int num) {
        String n = "";
        if (num == 0) {
            n = "0";
        }
        while (num != 0) {
            n = Integer.toString(num % 2) + n;
            num = num / 2;
        }
        return n;

    }

    public static void main(String[] args) {
        System.out.println("將一個10進位的數字換成二進位的數字\n請輸入一個十進位數字：");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(DecToBinary(num));
    }
}
