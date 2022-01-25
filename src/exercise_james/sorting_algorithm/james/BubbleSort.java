package exercise_james.sorting_algorithm.james;

import java.util.Arrays;

public class BubbleSort {
    private static int[] numbers = {12,4,5,7,3,1,11,9};

    public static void main(String[] args) {
        int[] sortNumber = bubleSort(numbers);
        System.out.println(Arrays.toString(sortNumber));
    }
    public static int[] bubleSort(int[] numbers) {
        int leng = numbers.length;

        for (int i = 0; i < leng - 1; i++)
        {
            for (int j = leng - 1; j > i; j++)
            {
                if (numbers[j] < numbers[j - 1])
                {
                    int temp = numbers[j];
                    numbers[j] = numbers[j -1];
                    numbers[j - 1] = temp;
                }

            }
        }
        return numbers;
    }
}
