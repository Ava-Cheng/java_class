package chapter3;

public class nested {

    public static void main(String[] args) {
       int n=6;
       //巢狀迴圈
       if(n>=5){
           if(n<=10){
               System.out.println("num is between 5 and 10");
           }
       }
       
       //&&全部條件同時檢查
       if(n>=5 && n<=10){
           System.out.println("num us between 5 and 10");
       }
       
       //&如果一開始的判斷不成立就跳開
       if(n>=5 & n<=10){
           System.out.println("num us between 5 and 10");
       }
       
    }
    
}
