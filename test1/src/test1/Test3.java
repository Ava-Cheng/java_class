package test1;

import java.util.Scanner;

public class Test3 {
    public static boolean isPrime(int num) {
        for(int i=2;i<=num-1;i++){
            if(num%i==0){
                return false;
            }
        }
        return false;
        
    }
    public static boolean isPalindrome(int num) {
        
        return false;
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("請輸入數字：");
        int num=sca.nextInt();
        isPrime(num);
        isPalindrome(num);
        if(isPrime(num)==false){
            System.out.print("不是質數");
        }else{
            System.out.print("是質數");
        }
        if(isPalindrome(num)==false){
            System.out.print("不是迴文");
        }else{
            System.out.print("是迴文");
        }
        
    }
    
}
