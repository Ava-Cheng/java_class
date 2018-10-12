
package chapter5;

public class printonetoten {

    public static void main(String[] args) {
       //for(){}迴圈
        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        
        System.out.println();
        
        //while(){}迴圈
        int count=1;
        while(count<=10){
            System.out.print(count+" ");
            count+=1;
        }
        
        System.out.println();
        
        //do{}while()迴圈
        int count2=1;
        do{
            //count2++;
            System.out.print(count2+" ");
            count2+=1;
        }while(count2<=10);
        
        
    }
    
}
