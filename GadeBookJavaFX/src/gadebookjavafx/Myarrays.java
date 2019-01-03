package gadebookjavafx;

public class Myarrays {

    public static final int Ascend = 0;
    public static final int Descend = 1;

    public static void sort(int[] data, int sortedMethod) {
        if (sortedMethod == Ascend) {
            sortAscend(data);
        } else {
            sortDescend(data);
        }
    }

    public static void sortAscend(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDescend(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] < data[j + 1]) {
                    int temp;
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int data[]={1,6,3,2,5};
        //Myarrays.sort(data,Ascend);
        Myarrays.sort(data,Descend);
        System.out.println(data[0]);
    }
}
