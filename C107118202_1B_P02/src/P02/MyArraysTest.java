package P02;

public class MyArraysTest {

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 2};
        MyArrays array_sort = new MyArrays(array);
        array_sort.sort(array,MyArrays.Ascend);
        array_sort.sort(array,MyArrays.Descend);
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{2, 4}, {6, 8}};
        System.out.println("兩矩陣相乘如下：");
        MyArrays.display2d(MyArrays.multiplyMatrix(a, b));
        double[][] points = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {5, 2}, {4, -0.5}};
        MyArrays p = new MyArrays(points);
        p.findFarthestPoints(points);
    }

}
