
package chapter5;

public class printTenToOne {

    public static void main(String[] args) {
       //for(){}迴圈
        for(int i=10;i>=1;i--){
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        //while(){}迴圈
        int count=10;
        while(count>=1){
            System.out.print(count+" ");
            count-=1;
        }
        
        System.out.println();
        
        //do{}while()迴圈
        int count2=10;
        do{
            //count2++;
            System.out.print(count2+" ");
            count2-=1;
        }while(count2>=1);
        
      
    }
    
}
