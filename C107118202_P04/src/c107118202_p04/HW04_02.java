package c107118202_p04;

import java.util.Scanner;

public class HW04_02 {
    public static String convertToGrade(int grade) {
        if(grade<60){
            return "F";
        }else if(grade<70){
            return "D";
        }else if(grade<80){
            return "C";
        }else if(grade<90){
            return "B";
        }else{
            return "A";
        }
    }
    public static void main(String[] args) {
       int num;
       Scanner sca=new Scanner(System.in);
       System.out.println("成績等第列印\n請輸入成績:");
       num=sca.nextInt();
       System.out.println("您的成績等第為："+convertToGrade(num));
    }
    
}
