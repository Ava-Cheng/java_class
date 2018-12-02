package p4;

import java.util.Scanner;

public class Problem4 {

    public static void binaryToDec(int value) {
        int sum = 0;
        String Str = value + "";
        for (int i = 1; i <= (Integer.toString(value)).length(); i++) {
            int dt = Integer.parseInt(Str.substring(i - 1, i));
            sum += (int) Math.pow(2, (Integer.toString(value)).length() - i) * dt;
        }
        System.out.print(sum);
    }

    public static void decToOct(int decimal) {
        String n = "";
        if (decimal == 0) {
            n = "0";
        }
        while (decimal != 0) {
            n = Integer.toString(decimal % 8) + n;
            decimal = decimal / 8;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        System.out.print("請輸入一個二進制的數字：");
        Scanner sca = new Scanner(System.in);
        String num = sca.nextLine();
        System.out.printf("%s的十進制為：", num);
        binaryToDec(Integer.valueOf(num).intValue());
        System.out.println();
        System.out.print("請輸入一個十進制的數字：");
        String num2 = sca.nextLine();
        System.out.printf("%s的八進制為：", num2);
        decToOct(Integer.valueOf(num2).intValue());
    }

}
