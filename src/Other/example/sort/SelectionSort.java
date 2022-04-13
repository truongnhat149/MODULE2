package example.sort;


public class SelectionSort {
    public void selectionSort(int numbers[]) {
        int indexMin, i, j;
        int leng = numbers.length;
        for (i = 0; i < leng; i++) {
            indexMin = i;
            for (j = i + 1; j < leng; j++) {
                if (numbers[j] < numbers[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                System.out.println("=> Trao đổi phần tử [ " +
                        numbers[i] + "," + numbers[indexMin] + " ]");
                int temp = numbers[indexMin];
                numbers[indexMin] = numbers[i];
                numbers[i] = temp;
            }
            System.out.print("Vòng lặp thứ " + (i + 1));
            display(numbers);
        }
    }

    public void display(int[] numbers) {
        int i;
        int leng = numbers.length;
        System.out.print("[");
        for (i = 0; i < leng; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 5, 7, 12, 56, 8, 31};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Mảng dữ liệu đầu vào ");
        selectionSort.display(numbers);
        System.out.println("-----------------");
        selectionSort.selectionSort(numbers);
        System.out.println("Mảng sau khi đã sắp xếp ");
        selectionSort.display(numbers);
    }
}
