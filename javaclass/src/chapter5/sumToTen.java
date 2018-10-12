
package chapter5;

public class sumToTen {

    public static void main(String[] args) {
       //1加到10
       int sum=0;
       for(int i=1;i<=10;i++){
           sum+=i;
       }
       System.out.println(sum);
       
       //10!
        int multiply=10;
        for(int i=9;i>=1;i--){
            multiply*=i;
        }
        System.out.println(multiply);
    }
    
}
