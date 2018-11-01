package c107118202_p06;

public class HW06_05 {

    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int k=1;k<=i;k++){
                for(int j=1;j<=i;j++){
                    System.out.print(i*j+" ");
                }
                break;
            }
            System.out.println();
        
        }
        for(int i=1;i<=9;i++){
            for(int j=9;j>=i;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

}
