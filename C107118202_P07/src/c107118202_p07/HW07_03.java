package c107118202_p07;

import static c107118202_p07.HW07_01.display;
import static c107118202_p07.HW07_01.sort;
import static c107118202_p07.HW07_02.sort2;

public class HW07_03 {
    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void sort(int[] array, String sortedMethod) {
        if (sortedMethod.equals("ascend")) {
            HW07_01.sort(array);
        } else if (sortedMethod.equals("descend")) {
            HW07_02.sort2(array);
        } else {
            System.out.println("參數不正確");
            return;
        }
    }

    public static void sort(int[] array, int sortedMethod) {
        if (sortedMethod == 0) {
            HW07_01.sort(array);
        } else if (sortedMethod == 1) {
            HW07_02.sort2(array);
        } else {
            System.out.println("參數不正確");
            return;
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 4, 3, 1, 2};
        System.out.print("data陣列：");
        display(data);
        System.out.println();
        System.out.println("由小到大排序:");
        System.out.print("(ascend)");
        sort(data, "ascend");
        System.out.println();
        System.out.print("(0)");
        sort(data, 0);
        System.out.println();
        System.out.println("由大到小排序:");
        System.out.print("(descend)");
        sort(data, "descend");
        System.out.println();
        System.out.print("(1)");
        sort(data, 1);
        System.out.println();
        System.out.println("輸入錯誤的參數：");
        System.out.print("(qq)");
        sort(data, "qq");
        System.out.print("(99)");
        sort(data, 99);
    }

}
