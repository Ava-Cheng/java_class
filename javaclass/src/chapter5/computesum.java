package chapter5;

import java.util.Scanner;

public class computesum {

    public static void main(String[] args) {
        int num1 = 1 + (int) (Math.random() * 10);
        int num2 = 1 + (int) (Math.random() * 10);
        int ans;
        System.out.printf("請問%d+%d=?", num1, num2);
        Scanner sca = new Scanner(System.in);
        ans = sca.nextInt();
        if (ans != num1 + num2) {
            while (ans != num1 + num2) {
                System.out.printf("輸入錯誤請再輸入一次,%d+%d=?", num1, num2);
                ans = sca.nextInt();
                if (ans == num1 + num2) {
                    System.out.println("恭喜你輸入正確");
                    break;
                }
            }
        } else {
            System.out.println("恭喜你輸入正確");
        }
        //System.out.println(1+(int)(Math.random()*10));
    }

}
