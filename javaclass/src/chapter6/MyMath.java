
package chapter6;
public class MyMath {
    public static int square(int n) {
      return n*n;
    }
    public static int max(int n1,int n2) {
        int result;
        if(n1>n2){
            result=n1;
        }else{
            result=n2;
        }
        return result;
    }
    public static void main(String[] args) {
       System.out.println(square(2));
       System.out.println(MyMath.square(2));
       System.out.println("最大的數字是:"+MyMath.max(5,9));
    }
    
}
