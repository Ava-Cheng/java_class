package c107118202_p06;

public class HW06_02 {

    public static void main(String[] args) {
        int[] array = new int[10];
        //System.out.println((int)(Math.random()*10));
        for (int i = 1; i <= 100000; i++) {
            array[(int) (Math.random() * 10)] += 1;
        }
        //System.out.println(array[0]);
        for (int k = 0; k <= 9; k++) {
            System.out.printf("%d出現了%d次\n", k, array[k]);
        }
    }

}
