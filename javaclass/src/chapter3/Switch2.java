package chapter3;

public class Switch2 {

    public static void main(String[] args) {
        int Season_Id = 1;
        String Season = "";
        switch (Season_Id) {
            case 1:
            case 2:
                System.out.println("上半年");
                break;
            case 3:
            case 4:
                System.out.println("下半年");
                break;
            default:
                Season = "輸入不正確";
                break;
        }
        
        /*int Season_Id = 4;
        String Season = "";
        switch (Season_Id) {
            case 1:
                Season = "春天";
                break;
            case 2:
                Season = "夏天";
                break;
            case 3:
                Season = "秋天";
                break;
            case 4:
                Season = "冬天";
                break;
            default:
                Season = "輸入不正確";
                break;
        }
        System.out.println(Season);
        */
      
        
        /*if(Season_Id==1){
           System.out.println("春天");
       }else if(Season_Id==2){
          System.out.println("夏天");
       }else if(Season_Id==3){
          System.out.println("秋天");
       }else if(Season_Id==4){
          System.out.println("冬天");
       }else{
         System.out.println("輸入錯誤");
        }*/
    }

}
