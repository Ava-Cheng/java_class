package c107118202_p01;

import java.util.Scanner;

public class HW01_02 {
    public static void main(String[] args) {
        double height,weight;
        System.out.println("BMI計算\n請輸入身高(公分)：");
        Scanner input=new Scanner(System.in);
        height=input.nextDouble();
        System.out.println("請輸入體重(公斤)：");
        weight=input.nextDouble();
        System.out.println("您的BMI為"+weight/Math.pow((height/100),2));
    }
    
}
