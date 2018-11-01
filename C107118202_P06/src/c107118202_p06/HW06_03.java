package c107118202_p06;

public class HW06_03 {

    public static int average(int array[]) {
        int sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum += array[i];
        }
        int ave = sum / array.length;
        return ave;

    }

    public static double sd(int array[]) {
        int len = array.length;
        int sum = 0;
        int a = 0;
        for (int i = 0; i <= 4; i++) {
            a = array[i] - average(array);
            sum = sum + (int) Math.pow(a, 2);

        }
        sum = sum / len;
        return Math.pow(sum, 0.5);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("平均數為：" + average(array));
        System.out.println("母體標準差為：" + sd(array));
    }
}
