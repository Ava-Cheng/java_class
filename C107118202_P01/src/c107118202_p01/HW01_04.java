package c107118202_p01;
import java.util.Scanner;
public class HW01_04 {
    public static void main(String[] args) {
       float c,f;
       System.out.println("華氏度數轉換成攝氏度數\n請輸入華氏度數：");
       Scanner input=new Scanner(System.in);
       f=input.nextFloat();
       c=(f-32)*5/9;
       System.out.printf("轉換結果為：攝氏度數(取到小數第二位)=%.2f\n", c);
    }
    
}
