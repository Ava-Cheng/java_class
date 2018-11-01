package chapter6;
public class MyMoth2 {
    public static double circleArea(int r) {
        return Math.pow(r, 2)*Math.PI;
    }
    public static double circleArea(double r) {
        return Math.pow(r, 2)*Math.PI;
    }
    public static void sayHello() {
        System.out.println("你好!");
        System.out.println("你好2!");
    }
    public static String sayHello(String name) {
        System.out.printf("%s",name);
        return name;
        
    }
    public static String gethi(String name) {
        String msg;
        msg=String.format("你好%s!",name);
        return msg;
        
    }
    public static void gethi() {
       System.out.println("王大大");
    }
    public static void main(String[] args) {
        //System.out.println(circleArea(2));
        //System.out.println(circleArea(2.5));
        sayHello();
        sayHello("李大大");
        gethi("王大大");
        System.out.println(gethi("王大大"));
    }
    
}
