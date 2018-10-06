package c107118202_p03;

public class HW03_02 {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

        System.out.println();

        int a = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; 6 >= j; j++) {
                if (j >= i) {
                    a += 1;
                    System.out.print(a);
                } else {
                    System.out.print(" ");
                }
            }
            a = 0;
            System.out.println();
        }

    }

}
