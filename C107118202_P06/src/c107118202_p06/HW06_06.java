package c107118202_p06;

import java.util.Scanner;

public class HW06_06 {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("自行輸入兩數字，分別印出因數與最大公因數");
        System.out.println("請輸入第一個數字：");
        int a = sca.nextInt();
        String a1 = "";
        System.out.println("請輸入第二個數字：");
        int b = sca.nextInt();
        String b1 = "";
        int max = 1;
        if (a == 0 || b == 0) {
            System.out.print("不能輸入0\n");
        } else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    a1 = a1 + i + " ";
                }
            }
            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    b1 = b1 + i + " ";
                }
            }
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    max = i;
                }
            }
            System.out.printf("第一個數字的因數為：%s\n", a1);
            System.out.printf("第二個數字的因數為：%s\n", b1);
            System.out.printf("兩數的最大公因數為：%d\n", max);
        }

    }

}
