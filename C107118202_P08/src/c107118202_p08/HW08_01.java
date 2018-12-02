package c107118202_p08;

import java.util.Scanner;

public class HW08_01 {
    public static double sumRow(double[][] m, int rowIndex) {
        double sum[] = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum[i] += m[i][j];
            }
        }
        return sum[rowIndex];
    }
    public static void allSumRow(double[][] array) {
        double sum[] = new double[3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum[i] += array[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("第%d列的元素總和為: %.1f\n", i, sum[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double matrix[][] = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sca.nextDouble();
            }
        }
        System.out.print("請指定列數ㄧ已回傳矩陣中該列數裡所有元素的總和：");
        int row=sca.nextInt();
        System.out.println(sumRow(matrix,row));
        allSumRow(matrix);

    }

}
