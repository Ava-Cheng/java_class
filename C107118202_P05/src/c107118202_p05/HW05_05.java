package c107118202_p05;

import java.util.Scanner;

public class HW05_05 {

    public static void main(String[] args) {
        int num = (int) (Math.random() * 100) + 1;
        int total = 0;
        int maxnum = 100;
        int minnum = 0;
        System.out.println("終極密碼答案:" + num);
        System.out.println("請輸入數字(1~100)或輸入-1離開:");
        Scanner input = new Scanner(System.in);
        int usernum = input.nextInt();
        if (usernum != -1) {
            if (usernum >= num) {
                maxnum = usernum;
            } else {
                minnum = usernum;
            }
            if (usernum != num) {
                System.out.printf("猜錯了,提示:%d~%d", minnum, maxnum);
            }
            total++;
        } else {
            System.out.println("再見!");
            total++;
        }
        while (usernum != num) {
            System.out.println("請輸入數字(1~100)或輸入-1離開:");
            usernum = input.nextInt();
            if (usernum != -1) {
                if (usernum >= num) {
                    maxnum = usernum;
                } else {
                    minnum = usernum;
                }
            } else {
                System.out.println("再見!\n");
                break;
            }
            total++;
            if (usernum != num) {
                System.out.printf("猜錯了,提示:%d~%d\n", minnum, maxnum);
            }

        }
        if (usernum == num) {
            System.out.printf("猜中了,數字就是:%d\n", num);
        }
        System.out.printf("共猜了%d次", total);
    }

}
