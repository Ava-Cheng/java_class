package chapter9;

public class BMItest {

    public static void main(String[] args) {
        BMI bill = new BMI(171, 52);
        System.out.println("你的BMI是:" + bill.GetBmi());
        System.out.println("針對你的BMI的建議是:" + bill.suggest());
        BMI will = new BMI();
        will.SetHeight(171);
        will.SetWeight(52);
        System.out.println("你的BMI是:" + will.GetBmi());
        System.out.println("針對你的BMI的建議是:" + will.suggest());
        /*
        BMI bill=new BMI();
        bill.SetHeight(171);
        bill.SetWeight(52);
        bill.showHeight();
        bill.showWeight();
        System.out.println("你的BMI是:"+ bill.GetBmi());
        System.out.println("針對你的BMI的建議是:"+ bill.suggest());
         */
    }

}
