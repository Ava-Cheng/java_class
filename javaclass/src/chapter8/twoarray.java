package chapter8;

public class twoarray {

    public static void display2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int scores[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("兩位學生各次上機考成績如下:");
        display2(scores);
    }

}
