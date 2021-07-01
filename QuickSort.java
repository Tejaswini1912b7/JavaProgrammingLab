public class QuickSort 
{
    String names[];
    int length;

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        String stringsList[] = {"tejaswini", "harsha", "sri laxmi", "keerthi", "priya", "lasya", "raj"};
        System.out.println("Strings given :  \"tejaswini\" \"harsha\" \"sri laxmi\" \"keerthi\" \"priya\" \"lasya\" \"raj\"");
        obj.sort(stringsList);

        for (String i : stringsList) {
            System.out.println(i);
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}
