package c107118202_p08;

import java.util.Scanner;

public class HW08_02 {

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double newmatrix[][] = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                newmatrix[i][j] = a[i][j]+b[i][j];
            }
        }
        return newmatrix;
    }

    public static void display(double[][] array1, double[][] array2, double[][] array3) {
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[0][i]+" ");
            
        }
        System.out.print("   ");
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[0][i]+" ");
            
        }
        System.out.print("   ");
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[0][i]+" ");
            
        }
        System.out.println();
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[1][i]+" ");
            
        }
        System.out.print(" + ");
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[1][i]+" ");
            
        }
        System.out.print(" = ");
        for(int i=0;i<array3.length;i++){
            System.out.print(array3[1][i]+" ");
            
        }

    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double matrix1[][] = new double[2][2];
        double matrix2[][] = new double[2][2];
        System.out.println("請輸入兩個2x2的矩陣");
        System.out.print("Enter matrix1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sca.nextDouble();
            }
        }
        System.out.print("Enter matrix2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = sca.nextDouble();
            }
        }
        System.out.println("The matrices are added as follows");
        display(matrix1,matrix2,addMatrix(matrix1, matrix2));
    }

}
