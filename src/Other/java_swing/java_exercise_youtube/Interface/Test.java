package java_exercise_youtube.Interface;

public class Test {
    public static void main(String[] args) {
        CalculatorFX500 calculatorFX500 = new CalculatorFX500();
        System.out.println("Addition a + b : " + calculatorFX500.addition(2, 4));
        System.out.println("Subtraction a - b: " + calculatorFX500.subtraction(2, 4));
        System.out.println("Multiplication a * b: " + calculatorFX500.multiplication(2, 4));
        System.out.println("Division a / b" + calculatorFX500.division(2, 4));

        // create arrays
        double[] arr = new double[] {1,6,72,63,4,8,6};
        double[] arr2 = new double[] {-34,2345,34,124,34};


        SelectSort selectSort = new SelectSort();
        InsertionSort insertionSort = new InsertionSort();

        System.out.println("Sort UP -> ");
        selectSort.sortUp(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.println("Sort Down <- ");
        insertionSort.descendingSort(arr2);
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");

        CalculatorApp calculatorApp = new CalculatorApp();
        calculatorApp.addition( 2, 4);
    }
}
