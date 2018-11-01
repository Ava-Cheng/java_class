package c107118202_p05;

import java.util.Scanner;

public class HW05_04 {

    public static void main(String[] args) {
        int total = 0;
        int stunum = 0;
        double num = 0;
        double age;
        int stunum2 = 0;
        int stunum3 = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int pass = 0;
        int fail = 0;
        Scanner input = new Scanner(System.in);
        while (stunum != -1) {
            System.out.println("請輸入學生成績：");
            stunum = input.nextInt();
            total += stunum;
            num += 1;
            if (stunum >= stunum2) {
                if(num==1){
                    stunum3 = stunum;
                }
                stunum2 = stunum;
            } else if (stunum2 > stunum3 && stunum != -1) {
                stunum3 = stunum;
            }
            if (stunum <= 59) {
                e++;
            } else if (stunum <= 69) {
                d++;
            } else if (stunum <= 79) {
                c++;
            } else if (stunum <= 89) {
                b++;
            } else {
                a++;
            }
            if (stunum >= 60) {
                pass++;
            } else {
                fail++;
            }
        }
        age = (total + 1) / (num - 1);
        System.out.printf("總分:%d\n", total + 1);
        System.out.printf("平均:%.2f\n", age);
        System.out.printf("最大值:%d\n", stunum2);
        System.out.printf("最小值:%d\n", stunum3);
        System.out.printf("A:%d\n", a);
        System.out.printf("B:%d\n", b);
        System.out.printf("C:%d\n", c);
        System.out.printf("D:%d\n", d);
        System.out.printf("E:%d\n", e - 1);
        System.out.printf("及格人數:%d\n", pass);
        System.out.printf("不及格人數:%d\n", fail - 1);
    }

}
