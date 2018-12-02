package p1;

public class Problem1 {

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double getAvg(int[] array) {
        double sum = 0.00;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //System.out.println(sum);
        //System.out.println(array.length);
        return sum / array.length;
    }

    public static void deviation(int array[]) {
        double sum = 0;
        double a = 0;
        for (int i = 0; i < array.length; i++) {
            a = (double) array[i] - getAvg(array);
            sum = sum + Math.pow(a, 2);

        }
        sum = sum / array.length;
        System.out.print(Math.pow(sum, 0.5));
    }

    public static int[] getLevel(int[] array) {
        int a[] = new int[11];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 100) {
                a[10] += 1;
            } else if (array[i] >= 90) {
                a[9] += 1;
            } else if (array[i] >= 80) {
                a[8] += 1;
            } else if (array[i] >= 70) {
                a[7] += 1;
            } else if (array[i] >= 60) {
                a[6] += 1;
            } else if (array[i] >= 50) {
                a[5] += 1;
            } else if (array[i] >= 40) {
                a[4] += 1;
            } else if (array[i] >= 30) {
                a[3] += 1;
            } else if (array[i] >= 20) {
                a[2] += 1;
            } else if (array[i] >= 10) {
                a[1] += 1;
            } else {
                a[0] += 1;
            }
        }
        return a;
    }

    public static void printStars(int[] array) {
        int[] grades = getLevel(array);
        int a = 0;
        int b = 9;
        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                System.out.print("00-09:");
            } else if (i == grades.length - 1) {
                System.out.print("100:");
            } else {
                System.out.printf("%s-%s:", a, b);
            }
            for (int j = 1; j <= grades[i]; j++) {
                System.out.print("*");
            }
            a += 10;
            b += 10;
            System.out.println();
        }
    }

    public static int[] addScore(int[] array) {
        int score_new [] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            score_new [i] = (int) (Math.pow(array[i], 0.5) * 10);
        }
        return score_new;
    }

    public static void main(String[] args) {
        int[] score = {25, 15, 56, 45, 35, 85, 63, 56, 100, 95, 88, 49, 86, 15, 15};
        System.out.print("成績陣列：");
        display(score);
        System.out.println();
        System.out.printf("最小值：%d\n", getMin(score));
        System.out.printf("平均分數：%.2f\n", getAvg(score));
        System.out.print("母體標準差：");
        deviation(score);
        System.out.println();
        System.out.print("10等地的成績等第之一維陣列:");
        display(getLevel(score));
        System.out.println();
        System.out.println("相對應的星狀長條圖：");
        printStars(score);
        System.out.print("每個成績開根號再乘以10:");
        display(addScore(score));

    }

}
