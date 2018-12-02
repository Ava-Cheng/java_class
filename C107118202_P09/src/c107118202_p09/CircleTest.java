package c107118202_p09;

public class CircleTest {

    public static void main(String[] args) {
        Circle r = new Circle(10);
        r.info();
        System.out.println("-------------------");
        Circle r_nul = new Circle();
        r_nul.setRadius(10);
        r_nul.info();
    }

}
