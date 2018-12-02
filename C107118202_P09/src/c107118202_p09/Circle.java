package c107118202_p09;

public class Circle {

    private int radius;

    public Circle(int r) {
        radius = r;
        System.out.println("新物件產生!有半徑");
    }

    public void setRadius(int r) {
        radius = r;
    }

    public Circle() {
        System.out.println("新物件產生!沒有給半徑");
    }

    public double getLength() {
        return radius*2*3.14;
    }

    public double getArea() {
        return radius*radius*3.14;
    }

    public void info() {
        System.out.printf("半徑 %d\n",radius);
        System.out.printf("直徑 %d\n",radius*2);
        System.out.printf("圓周長：%.2f\n" , getLength());
        System.out.printf("圓面積：%.2f\n" , getArea());
    }
}
