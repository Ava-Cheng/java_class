
package chapter5;

import java.util.Scanner;

public class sum {

  
    public static void main(String[] args) {
        int num;
        int score=0;
        Scanner sca=new Scanner(System.in);
        System.out.println("請輸入成績或者-1結束輸入:");
        num=sca.nextInt();
        while(num!=-1){
            score+=num;
            System.out.println("請輸入成績或者-1結束輸入:");
            num=sca.nextInt();
        }
        System.out.println(score);
    }
    
}
