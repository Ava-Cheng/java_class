package P01;

public class GradeBook2D {

    private String[] names;
    private int[][] grades;
    //建構子

    public GradeBook2D(String[] names, int[][] grades) {
        this.names = names;
        this.grades = grades;
    }

    public void printAllStuScore() {
        int total = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < grades[0].length; j++) {
                if (j == 0) {
                    System.out.printf("%s的成績為:", names[i]);
                }
                System.out.printf("%d ", grades[i][j]);
                total += grades[i][j];
            }
            System.out.printf("且平均成績為：%.2f分", (float) total / 4);
            System.out.println();
            total = 0;
        }
    }

    public void printSubjectAvg() {
        int total = 0;
        for (int i = 0; i < grades[0].length; i++) {
            for (int j = 0; j < names.length; j++) {
                total += grades[j][i];
            }
            System.out.printf("第%d科目的平均成績為：%.2f分\n", i + 1, (float) total / 3);
            total = 0;
        }
    }

    public void printStuInfo(String name) {
        int total = 0;
        boolean no_such_person = false;
        for (int i = 0; i < names.length; i++) {
            if (this.names[i].equals(name)) {
                for (int j = 0; j < grades[0].length; j++) {
                    if (j == 0) {
                        System.out.printf("%s的成績為:", names[i]);
                    }
                    System.out.printf("%d ", grades[i][j]);
                    total += grades[i][j];
                }
                System.out.printf("且平均成績為：%.2f分", (float) total / 4);
                no_such_person = true;
            }
        }
        if (no_such_person == false) {
            System.out.println("沒有這個人!");
        }
    }
}
