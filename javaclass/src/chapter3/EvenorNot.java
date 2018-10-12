package chapter3;
public class EvenorNot {

    public static void main(String[] args) {
       int num=8;
       if(num%2==0 && num%3==0){
           System.out.println("可以同時被3跟2整除");
       }
       if(num%2==0 || num%3==0){
           System.out.println("可以被3或2整除");
       }
       if(num%2==0 ^ num%3==0){
           System.out.println("可以被3或2其一整除");
       }
    }
    
}
