package P02;

public class MyArrays {

    public static final int Ascend = 0;
    public static final int Descend = 1;
    private double[][] points;
    private int[] array;

    public MyArrays(double[][] points) {
        this.points = points;
    }

    public MyArrays(int[] array) {
        this.array = array;
    }

    public static void sort(int[] array, int sortedMethod) {
        if (sortedMethod == 0) {
            sortAscend(array);
        } else {
            sortDescend(array);
        }
    }

    public static void sortAscend(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        display(array);
    }

    public static void sortDescend(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        display(array);
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        c[0][0]=a[0][0]*b[0][0]+a[0][1]*b[1][0];
        c[0][1]=a[0][0]*b[0][1]+a[0][1]*b[1][1];
        c[1][0]=a[1][0]*b[0][0]+a[1][1]*b[1][0];
        c[1][1]=a[1][0]*b[0][1]+a[1][1]*b[1][1];
        return c;

    }

    public static void display2d(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
    }

    public static void findFarthestPoints(double[][] points) {
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]); // Initialize shortestDistance

        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance
                if (shortestDistance < distance) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }
        // Display result
        System.out.print("兩個最遠的點分別是： "
                + "(" + points[p1][0] + ", " + points[p1][1] + ") 和 ("
                + points[p2][0] + ", " + points[p2][1] + ")  ");
        double ans = Math.pow(Math.pow(points[p1][0] - points[p2][0], 2) + Math.pow(points[p1][1] - points[p2][1], 2), 0.5);
        System.out.printf("其最長距離為：%.6f", ans);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
