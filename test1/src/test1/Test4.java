/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author yucun
 */
public class Test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int line = 8;
        for (int i = 1; i <= line; i++) {
            for (int j = 0; j < line - i; j++) {//用来输出制表符的。因为数字有123位的，用空格不整齐
                System.out.print("\t");
            }
            for (int j = 1; j < Math.pow(2, i); j *= 2) {//输出依次增大的Math.pow(2, i)是求2的i次方
                System.out.print(j + "\t");
            }
            for (int j = (int) Math.pow(2, i - 2); j > 0; j /= 2) {//输出依次减小的
                System.out.print(j + "\t");
            }
            System.out.println();//换行
        }
    }

}
