package c107118202_p01;
import java.util.Scanner;
public class HW01_03 {
    public static void main(String[] args) {
        int s,a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("給一個三位數的數字如 123，將印出 1**2**3\n請輸入三位數數字：");
        s=input.nextInt();
        a=s/100;
        b=(s-a*100)/10;
        c=s-a*100-b*10;
        System.out.printf("結果為%d**%d**%d",a,b,c);
    }
}
