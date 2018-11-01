package c107118202_p05;

import java.util.Scanner;

public class HW05_03 {

    public static int numberOfPrimes(int num1, int num2) {
        int n=0;
        for(int i=num1;i<=num2;i++){
            if(isPrime(i)==0){
                n++;
                
            }
        }
        return n;

    }

    public static int isPrime(int num) {
        int k = 2;
        String str = "yes";
        while (num > k) {
            if ((num % k == 0)) {
                str = "no";
                break;  
            }
            k++;
        }
        if (num <= 1) {
           str = "no";
        }
        if(str == "no"){
            return 1;
        }else{
            return 0;
        }     
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("計算所有的質數個數\n給你兩個數字，請算出這兩個數字之間有幾個質數(包含輸入的兩個數字 )\n請輸入第一個數：");
        int num1 = input.nextInt();
        System.out.println("請輸入第二個數：");
        int num2 = input.nextInt();
        System.out.println(numberOfPrimes(num1, num2) + "個");
    }

}
