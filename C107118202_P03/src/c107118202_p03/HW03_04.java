package c107118202_p03;

import java.util.Scanner;

public class HW03_04 {

    public static void main(String[] args) {
        int num;
        int k = 2;
        String str = "no";
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入一個數，判斷該數是否為質數。");
        num = input.nextInt();
        while (num > k) {
            if (num % k == 0) {
                str = "yes";
            }
            k++;
        }
        if (str == "yes") {
            System.out.printf("%d不是質數\n", num);
        } else {
            System.out.printf("%d是質數\n", num);
        }

    }

}
