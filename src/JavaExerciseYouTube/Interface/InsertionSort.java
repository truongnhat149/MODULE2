package JavaExerciseYouTube.Interface;

public class InsertionSort implements SortInterface{
    @Override
    public void sortUp(double[] arr) {
        int n = arr.length; // số lượng phần tử
        double temp;
        int i, j;
        for (i = 1; i < n; i++){
            temp = arr[i];
            j = i -1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
    }

    @Override
    public void descendingSort(double[] arr) {
        int n = arr.length; // số lượng phần tử
        double temp;
        int i, j;
        for (i = 1; i < n; i++){
            temp = arr[i];
            j = i -1;

            while (j >= 0 && arr[j] < temp) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = temp;
        }
    }
}
