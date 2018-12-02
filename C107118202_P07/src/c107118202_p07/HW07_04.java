package c107118202_p07;

public class HW07_04 {

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;

    }

    public static int binarySearch(int[] array, int key) {
        boolean isSorted = isSorted(array);
        if (isSorted == false) {
            System.out.println("請先排序資料，資料未經排序，搜尋結果將會不正確!");
        }
        //判斷該陣列是否為已排序(由小到大!)，若是未排序，則列印"請先排序資料，資料未經排序，搜尋結果將會不正確!" 
        int low = 0;
        int high = array.length - 1;
        while (high >= low) {
            int m = (high + low) / 2;
            if (key < array[m]) {
                high = m - 1; //在左半邊
            } else if (key == array[m]) {
                return m;
            } else {
                low = m + 1; //在右半邊
            }
            //System.out.print(low);
            //System.out.println(high);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 7, 9};
        int[] data2 = {1, 3, 5, 7, 9, 2};
        int n = 5;
        int k = 2;
        System.out.print("data陣列輸出：");
        display(data);
        System.out.println();
        System.out.print("data2陣列輸出：");
        display(data2);
        System.out.println();
        System.out.printf("搜尋data陣列，搜尋數值%d，索引值(-1代表沒找到):%d", n, binarySearch(data, n));
        System.out.println();
        System.out.printf("搜尋data陣列，搜尋數值%d，索引值(-1代表沒找到):%d", k, binarySearch(data, k));
        System.out.println();
        System.out.printf("搜尋data2陣列，搜尋數值%d:\n", n);
        System.out.printf("索引值:%d", binarySearch(data2, n));

    }

}
