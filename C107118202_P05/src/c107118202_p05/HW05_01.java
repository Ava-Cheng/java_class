package c107118202_p05;

import java.util.Scanner;

public class HW05_01 {
    public static String inverse(int num) {
        String str="";
        int n=Integer.toString(num).length();
        for(int i=1;i<=n;i++){
            str+=num%10;
            num-=num%10;
            num/=10;
        } 
        return str;
    }
    public static void main(String[] args) {
        System.out.println("請輸入一串數字：");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(inverse(num));
    }
    
}
