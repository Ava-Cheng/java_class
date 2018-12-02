package test1;

import java.util.Scanner;

public class Test2 {
    public static boolean isTriangle(int a,int b,int c) {
        if(a+b>c || a+c>b || b+c>a){
            return true;
        }else{
            return false;
        }
    }
    public static double area(int a,int b,int c) {
        int sum=(a+b+c)/2;
        return Math.pow(sum*(sum-a)*(sum-b)*(sum-c),0.5);   
    }
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("請輸入三角形的各邊邊長（請用空白隔開）");
        String str=sca.nextLine();
        String[] strnum=str.split(" ");
        int a=Integer.parseInt(strnum[0]);
        int b=Integer.parseInt(strnum[1]);
        int c=Integer.parseInt(strnum[2]);
        int sum=(a+b+c)/2;
        System.out.printf("您輸入的三邊是否能形成三角形：%b\n",isTriangle(Integer.parseInt(strnum[0]),Integer.parseInt(strnum[1]),Integer.parseInt(strnum[2])));
        System.out.printf("此三角形面積為：%.1f\n",area(Integer.parseInt(strnum[0]),Integer.parseInt(strnum[1]),Integer.parseInt(strnum[2])));
        if(a>0&b>0&c>0){
            System.out.printf("此三角形面積為：%.1f\n",Math.pow(sum*(sum-a)*(sum-b)*(sum-c),0.5));
        }else{
            System.out.println("無法計算，請輸入有效的邊長\n");
        }
    }
    
}
