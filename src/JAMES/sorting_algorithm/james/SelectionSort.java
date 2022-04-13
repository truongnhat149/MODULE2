package exercise_james.sorting_algorithm.james;

public class SelectionSort {
    public static void selectionSort(int[] array)
    {
        int min;
        int leng = array.length;
        for (int i = 0; i < leng; i++)
        {
            min = i;
            for (int j = i + 1; j < leng; j++)
            {
                if(array[j] < array[min])
                {
                    min = j;
                }
            }
            if (min != i)
            {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }// 4 3 5 8
    }
}
