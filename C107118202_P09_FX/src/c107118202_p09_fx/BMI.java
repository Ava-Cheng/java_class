package c107118202_p09_fx;

public class BMI {

    private int height;
    private int weight;

    public BMI(int h,int w) {
       height=h; 
       weight=w; 
       System.out.println("新物件產生!有身高體重!");
    }
    public BMI(){
        System.out.println("新物件產生!沒有給身高體重!");
    }
    public String suggest() {
        double bmi = GetBmi();
        String suggest;
        if (bmi < 18.5) {
            suggest = "體重過輕!";
        } else if (bmi < 24) {
            suggest = "正常範圍!";
        } else if (bmi < 27) {
            suggest = "過重!";
        } else if (bmi < 30) {
            suggest = "輕度肥胖!";
        } else if (bmi < 35) {
            suggest = "中度肥胖!";
        } else {
            suggest = "重度肥胖!";
        }
        return suggest;
    }

    public double GetBmi() {
        return weight / Math.pow(height / 100.0, 2);
    }

    public void SetHeight(int h) {
        height = h;
    }

    public void SetWeight(int w) {
        weight = w;
    }

    public void showHeight() {
        System.out.println("height:" + height);
    }

    public void showWeight() {
        System.out.println("weight:" + weight);
    }
}
