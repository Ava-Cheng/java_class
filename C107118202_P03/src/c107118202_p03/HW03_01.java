package c107118202_p03;

public class HW03_01 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= 1; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}
