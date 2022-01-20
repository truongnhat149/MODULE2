package java_exercise_youtube.Interface;

public class CalculatorApp implements Calculator,
         SortInterface {
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplication(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }

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
