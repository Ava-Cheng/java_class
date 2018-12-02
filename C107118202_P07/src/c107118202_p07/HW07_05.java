package c107118202_p07;

public class HW07_05 {
    public static void age(int[][] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
            System.out.printf("第%d位平均:%d\n",i+1,sum/(array.length+1));
            sum=0;
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("第一位成績：1, 2, 3");
        System.out.println("第一位成績：4, 5, 6");
        age(array);
    }

}
