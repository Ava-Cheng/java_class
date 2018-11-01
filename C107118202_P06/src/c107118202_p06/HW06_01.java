package c107118202_p06;

public class HW06_01 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int max = array[0];
        //System.out.println(max);
        for (int i = 1; i <= 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("此陣列中最大值為：%d\n", max);
    }

}
