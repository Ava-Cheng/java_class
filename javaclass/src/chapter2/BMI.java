package chapter2;
public class BMI {
    public static void main(String[] args) {
       int height=180;
       int weight=70;
       double bmi;
       bmi=weight/Math.pow((double)height/100, 2);
       System.out.print(bmi);
    }
    
}
