package test1;

import java.util.Scanner;

public class Test1 {
    public static double getAvg(int[] array) {
        double sum = 0.00;
        for(int i=0;i<=5;i++){
            sum+=array[i];
        }
        return sum/6;
    }
    public static void sd(int[] array) {
        double sum=0;
        //double avg =Math.round(getAvg(array)/.01)*.01;
        double avg =getAvg(array);
        //System.out.println(avg);
        for(int i=0;i<=array.length-1;i++){
            sum+=Math.pow(array[i]-avg,2);
        }
        System.out.printf("標準差=%.2f\n",Math.pow(sum/6.00,0.5));
    }
    public static int max(int[] array) {
        int intmax=array[0];
        for(int i=0;i<=array.length-2;i++){
            if(array[i+1]>=array[i]){
                intmax=array[i+1];
            }
        }
        return intmax;
    }
    public static void PassFailNum(int[] array) {
        int m=0;
        int n=0;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]<60){
                m++;
            }else{
                n++;
            }
        }
        System.out.printf("及格人數：%d\n",n);
        System.out.printf("不及格人數：%d\n",m);
    }
    public static void grades(int[] array) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int f=0;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]>=90){
                a++;
            }else if(array[i]>=80){
                b++;
            }else if(array[i]>=70){
                c++;
            }else if(array[i]>=60){
                d++;
            }else{
                f++;
            }
        }
        System.out.printf("Ａ(90~100):%d\n",a);
        System.out.printf("B(80~100):%d\n",b);
        System.out.printf("C(70~100):%d\n",c);
        System.out.printf("D(60~100):%d\n",d);
        System.out.printf("F(60分以下):%d\n",f);   
    }
    public static int linearSeach(int[] array) {
        Scanner sca=new Scanner(System.in);
        System.out.println("請輸入一個數值：");
        int num1=sca.nextInt();
        int num=-1;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]==num1){
                num=i+1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int scores[]={96,90,85,78,60,52};
        for(int i=0;i<=scores.length-1;i++){
            System.out.print(scores[i]+" ");
        }
        System.out.println();
        System.out.printf("平均=%.2f\n",getAvg(scores));
        sd(scores);
        System.out.printf("最高分=%d\n",max(scores));
        PassFailNum(scores);
        grades(scores);
        System.out.println("scores[]=96 90 85 78 60 52");
        System.out.printf("找到！在此陣列的索引為%d的位置\n",linearSeach(scores));
    }
    
}
