package JavaExerciseYouTube.Interface;


public class SelectSort implements SortInterface{
    @Override
    public void sortUp(double[] arr) {

        int i, j, min_Index, n = arr.length;
        for (i = 0; i < n; i++) {
            min_Index = i;
            for (j = i + 1; j < n; j++) {
                if ( arr[j] < arr[min_Index])
                    min_Index = j;
                double temp = arr[min_Index];
                arr[min_Index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    @Override
    public void descendingSort(double[] arr) { // sắp xếp giảm
        int i, j, min_Index, n = arr.length;
        for (i = 0; i < n; i++) {
            min_Index = i;
            for (j = i + 1; j < n; j++) {
                if ( arr[j] < arr[min_Index])
                    min_Index = j;
                double temp = arr[min_Index];
                arr[min_Index] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
