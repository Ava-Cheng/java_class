package c107118202_p06;

import java.util.Scanner;

public class HW06_04 {

    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int order = 0;
        Scanner sca = new Scanner(System.in);
        while (order != -1) {
            System.out.println("輸入餐點代號(1牛排 / 2雞排 /3豬排)，輸入-1點餐結束");
            order = sca.nextInt();
            switch (order) {
                case 1:
                    x1++;
                    break;
                case 2:
                    x2++;
                    break;
                case 3:
                    x3++;
                    break;
                default:
                    System.out.println("選擇錯誤,請重新選擇");
                    break;
            }
        }
        System.out.printf("牛排%d份、", x1);
        System.out.printf("雞排%d份、", x2);
        System.out.printf("豬排%d份\n", x3);
    }

}
