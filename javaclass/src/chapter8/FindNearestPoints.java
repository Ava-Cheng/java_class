package chapter8;

public class FindNearestPoints {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    }

    public static void main(String[] args) {
        double[][] points = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {5, 2}, {4, -0.5}};
        //System.out.println(distance(0,0,3,4));
        int p1 = 0;
        int p2 = 1;
        double shorttest = 999;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if (shorttest > d) {
                    p1 = i;
                    p2 = j;
                    shorttest = d;
                }
            }
        }
        System.out.printf("points[%d][0],points[%d][1]+points[%d][0],points[%d][1],最短距離:%f",p1,p1,p2,p2,shorttest);
    }

}
