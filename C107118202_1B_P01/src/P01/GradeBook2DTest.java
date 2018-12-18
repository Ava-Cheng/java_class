package P01;

import java.util.Scanner;

public class GradeBook2DTest {

    public static void main(String[] args) {
        // 3 位學生之各 4 門科目的成績
        String names[] = {"Nancy", "Frank", "John"};
        int grades[][] = {{77, 68, 86, 73}, {96, 87, 89, 78}, {70, 90, 91, 81}};
        //new 一個物件，並給予姓名與成績陣列
        GradeBook2D gbook1 = new GradeBook2D(names, grades);
        gbook1.printAllStuScore(); //(1)展示列印學生成績方法
        gbook1.printSubjectAvg();
        Scanner sca=new Scanner(System.in);
        System.out.println("請輸入要搜尋的名字：");
        String name = sca.nextLine();
        gbook1.printStuInfo(name);
    }

}
