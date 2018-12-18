package c107118202_p03_fx;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getLength() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
