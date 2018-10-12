package c107118202_p04;

import java.util.Scanner;

public class HW04_01 {
    public static int commonFactor(int n1,int n2,int num) {
        for(int i=1;i<=n1&i<=n2;i++){
            if(n1%i==0 & n2%i==0){
                num=i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int num1,num2;
        Scanner sca=new Scanner(System.in);
        System.out.println("給定兩個數字，請算出它們的最大公因數:\n請輸入第一個數字:");
        num1=sca.nextInt();
        System.out.println("請輸入第二個數字:");
        num2=sca.nextInt();
        System.out.println(num1+"和"+num2+"最大公因數為"+commonFactor(num1,num2,1));
        
        
    }
    
}
