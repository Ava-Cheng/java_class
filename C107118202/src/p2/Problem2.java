package p2;

public class Problem2 {

    public static boolean hasSameScore(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void printSameScore(int[] array) {
        if (!hasSameScore(array)) {
            System.out.println("沒有相同值");
        }
        boolean sameFirst = false;
        int checked[] = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            if (checked[i] == 1) {
                continue;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !sameFirst) {
                    System.out.print(array[i] + ": " + i + " ");
                    sameFirst = true;
                    checked[i] = 1;
                }
                if (array[i] == array[j]) {
                    checked[j] = 1;
                    System.out.print(j + " ");
                }
            }
            if (sameFirst) {
                System.out.println();
            }
            sameFirst = false;
        }
    }

    public static void main(String[] args) {
        int[] score = {25, 15, 56, 45, 35, 85, 63, 56, 100, 95, 88, 49, 86, 15, 15};
        int[] score2 = {25, 15, 56, 45, 35, 85, 63, 58, 100, 95, 88, 49, 86, 17, 12};
        System.out.printf("score陣列有無分數重複：%b\n", hasSameScore(score));
        System.out.printf("score2陣列有無分數重複：%b\n", hasSameScore(score2));
        printSameScore(score);
    }

}
