package chapter7;
public class ArrayDemo {
    public static void display(int array[]) {
        for(int i=1;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
       int[]array;
       array=new int[3];
       array[0]=10;
       array[1]=20;
       int[]array2={1,2,6};
       //System.out.println(array[0]);
       //array2[0]++;
       System.out.println(array2[0]);
       display(array2);
       
    }
  
}
