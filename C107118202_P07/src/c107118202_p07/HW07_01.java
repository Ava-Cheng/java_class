package c107118202_p07;

public class HW07_01 {

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        display(array);
    }
    public static void main(String[] args) {
        int[] data = {5, 4, 3, 1, 2};
        System.out.print("data陣列：");
        display(data);
        System.out.println();
        System.out.print("由小到大排序:");
        sort(data);
        System.out.println();
    }

}
