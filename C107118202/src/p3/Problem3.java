package p3;
public class Problem3 {
     public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static  int[] arrayCopy(int[] array) {
        int Co[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Co[i]=array[i];
        }
        return Co;
    }
    public static boolean equals(int[] array1, int[] array2){
        String a="0";
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]!=array2[i]){
                    a="1";
                }
            }
        }
         if(a=="0"){
             return true;
         }else{
             return false;
         }
    }
    public static void main(String[] args) {
       int [] array1 = {1,2,3,4,5}; 
       int [] array2;
       System.out.print("array1陣列原始內容：");
       display(array1);
       System.out.println();
       array2 = arrayCopy(array1);
       System.out.print("array2複製出來的新陣列內容：");
       display(array2);
       System.out.println();
       System.out.print("判斷是否完全相等：");
       System.out.println(equals(array1,array2));
       
       
    }
    
}
