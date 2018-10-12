package chapter2;

import java.util.Scanner;


public class printfDemo {

  
    public static void main(String[] args) {
      /* String name="王大大";
       int score=80;
       //double s=50.5
       System.out.printf("姓名:%s  分數:%d\n ",name,score);*/
       //System.out.printf("姓名:%s  分數:%d\n 分數2:%.1f",name,score,s);
       
      /* double area=5.123456789;
       System.out.printf("小數:%.3f\n",area);*/
      
      String name;
      int age;
      Scanner input=new Scanner(System.in);
      System.out.println("請輸入姓名:");
      name=input.nextLine();
      System.out.printf("%s\n你好，歡迎您來到JAVA的世界!",name);
      System.out.println("請輸入年齡:");
      age=input.nextInt();
      System.out.printf("您%d\n",age);
      
    }
    
}
