package chapter7;
public class Myarray {
    public static void sort(int data[]) {
       int temp;
        for(int i=0;i<data.length-1;i++){
           for(int j=0;j<data.length-1-i;j++){
               if(data[j]>data[j+1]){
                   temp=data[j];
                   data[j]=data[j+1];
                   data[j+1]=temp;
               }
           }
       }
    }
    public static void sort2(int data[]) {
       int temp;
        for(int i=0;i<data.length-1;i++){
           for(int j=0;j<data.length-1-i;j++){
               if(data[j]<data[j+1]){
                   temp=data[j];
                   data[j]=data[j+1];
                   data[j+1]=temp;
               }
           }
       }
    }
    public static void sortedMethod(int[] array, String sortedMethod) {
        if(sortedMethod.equals("ascend")){
            sort(array);
        }else if(sortedMethod.equals("descend")){
            sort2(array);
        }else{
            System.out.println("參數不正確");
        }
    }
    
    public static void display(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int data[]={5,4,3,1,2};
        sortedMethod(data,"descend");
        display(data);
        sortedMethod(data,"ascend");
        display(data);
        /*
        sort(data);
        display(data);
        sort2(data);
        display(data);
        */
    }
    
}
