package c107118202_p08;

import java.util.Scanner;

public class HW08_04 {
    public static int[] locateSmallest(double[][] a){
        int num[]=new int[2];
        int b=(int)a[0][0];
        for(int i =0; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(a[i][j] < b){
                    num[0]=i;
                    b=(int)a[i][j];
                    num[1]=j;
                }
            }
        }
        //System.out.print(num[0]);
        //System.out.print(num[2]);
        return num; 
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");
        int a[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = sca.nextInt();
        }
        double matrix[][] = new double[a[0]][a[1]];
        System.out.println("Enter the array:");
        for (int i = 0; i < a[0]; i++) {
            for (int j = 0; j < a[1]; j++) {
                matrix[i][j] = sca.nextDouble();
            }
        }
        int b[]=locateSmallest(matrix);
        System.out.print("The location of the smallest element is at ("+b[0]+","+b[1]+")");        
    }
    
}
