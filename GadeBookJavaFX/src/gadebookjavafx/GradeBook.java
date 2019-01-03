package gadebookjavafx;

public class GradeBook {

    int grades[];

    public GradeBook(int gradesArray[]) {
        grades = gradesArray;
    }

    public GradeBook() {
    }

    public static void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
//方法:設定成績

    public void setGrades(String data) {
        String gradesStr[] = data.split(" ");
        this.grades = new int[gradesStr.length];
        for (int i = 0; i < gradesStr.length; i++) {
            this.grades[i] = Integer.parseInt(gradesStr[i]);
        }
    }

    public void setGrades(int gradesArray[]) {
        grades = gradesArray;
    }
//方法:拿到平均成績

    public double getAvg() {
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return (double) total / grades.length;
    }

    public void sortAscend() {
        Myarrays.sort(this.grades, Myarrays.Ascend);
    }

    public void sortDescend() {
        Myarrays.sort(this.grades, Myarrays.Descend);
    }
    //方法:拿到所有成績(字串)

    public String getAllGrades() {
        String msg = "";
        for (int i = 0; i < grades.length; i++) {
            msg += String.format("%d ", grades[i]);
        }
        msg += "\n";
        return msg;
    }

    public static void main(String[] args) {
        //int data[] = {1, 6, 3, 2, 5};
        String s = "1 6 3 2 5";
        GradeBook gb = new GradeBook();
        gb.setGrades(s);
        //gb.setGrades(data);
        //System.out.println(gb.getAvg());
        gb.sortAscend();
        //System.out.println(s);
    }

}
