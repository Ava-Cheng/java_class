package c107118202_p01;

import java.util.Scanner;

public class HW01_01 {

    public static void main(String[] args) {
       float c,f;
       System.out.println("攝氏度數轉換成華氏度數\n請輸入攝氏度數：");
       Scanner input=new Scanner(System.in);
       c=input.nextFloat();
       f=c*9/5+32;
       System.out.printf("轉換結果為：華氏度數(取到小數第二位)=%.2f\n", f);
    }
    
}
