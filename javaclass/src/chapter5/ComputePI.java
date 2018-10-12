package chapter5;
public class ComputePI {
    public static void main(String[] args) {
        double pi=0;
        int num=50000000;
        for(int i=1,k=1;i<=num;i++,k+=2){
            if(i%2==0){
                pi=pi-4.0/k;
            }else{
                pi=pi+4.0/k;//整數除與整數會是整數:
            }
        }
        System.out.println(pi);
    }
    
}
