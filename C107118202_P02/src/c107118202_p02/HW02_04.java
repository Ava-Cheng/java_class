package c107118202_p02;

import java.util.Scanner;

public class HW02_04 {

    public static void main(String[] args) {
        double height, weight, num;
        String suggest;
        System.out.println("BMI計算\n請輸入身高(公分)：");
        Scanner input = new Scanner(System.in);
        height = input.nextDouble();
        System.out.println("請輸入體重(公斤)：");
        weight = input.nextDouble();
        num = weight / Math.pow((height / 100), 2);
        if (num < 18.5) {
            suggest = "您’過輕‘呢，要多吃點營養食物，讓自己邁向更健康的身體吧。";
        } else if (18.5 <= num && num < 25.0) {
            suggest = "很棒呢！是'正常'的範圍，繼續保持:)";
        } else if (25.0 <= num && num < 30.0) {
            suggest = "有點‘過重’了喔，要控制一下自己的飲食習慣。";
        } else {
            suggest = "糟糕！您已達到‘肥胖’，肥胖容易引起疾病，要多多注意自己的健康喔。";
        }
        System.out.printf("您的BMI為%.1f\n對於20歲以上的BMI建議：%s\n", num, suggest);
    }

}
