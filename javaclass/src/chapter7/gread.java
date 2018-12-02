package chapter7;

public class gread {

    public static void main(String[] args) {
        int grade[] = {53, 42, 63,66};
        int score[];
        score=getlevel(grade);
        display(score);
        //int grade_new[];
        //grade_new=getplus10(grade);
        //display(grade);
        //display(grade_new);
        //plus10(grade);
        //display(grade);

    }
     public static int[] getlevel(int[] array) {
        int levels[]=new int[array.length];
        for(int i=1;i<array.length;i++){
            levels[array[i]/10]+=1;
        }
        return levels;
    }
    public static int[] getplus10(int[] array) {
        int result[]=new int[array.length];
        for (int i = 0; i <= array.length - 10; i++) {
           result[i] = array[i] +10;
        }
        return result;
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void plus10(int[] array) {
        for (int i = 0; i <= array.length - 10; i++) {
            array[i] += 10;
        }
    }
}
