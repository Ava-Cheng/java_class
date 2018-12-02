package chapter7;

public class season {

    public static void main(String[] args) {
        String season[] = new String[4];
        season[0] = "春";
        season[1] = new String("夏");
        season[2] = new String("秋");
        season[3] = new String("冬");
        display(season);
        String suits[]={"Hearts","Diamonds","Clubs","Spades"};
        display(suits);
    }

    public static void display(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
