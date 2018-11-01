package chapter6;

import java.util.Scanner;

public class Mymath3 {
    public static int sum(int a,int b) {
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
       
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("請輸入兩個變數,讓a加到b:\n請輸入第一個數");
        int a=input.nextInt();
         System.out.println("請輸入第二個數");
        int b=input.nextInt();
        System.out.println(sum(a,b));
    }
    
}
