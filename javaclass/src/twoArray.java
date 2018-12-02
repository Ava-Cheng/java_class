public class twoArray {
     public static void display2(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       int a[]={1,2,3};
       int b[]={4,5,6};
       int array[][]=new int[2][];
       array[0]=new int[3];
       array[1]=new int[5];
       array[0]=a;
       array[1]=b;
       display2(array);
       /*
       int array[][]=new int[2][3];
       array[0][0]=1;
       array[0][1]=2;
       display2(array);
       System.out.println(array[0].length);
        */
    }
    
}
