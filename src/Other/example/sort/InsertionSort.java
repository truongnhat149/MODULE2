package example.sort;

public class InsertionSort {
    public void insertionSort(int arr[]) {
        int giaTriDeChen;
        int viTriDeChen;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // Chọn giá trị để chèn
            giaTriDeChen = arr[i];

            // lựa chọn vị trí để chèn (cờ)
            viTriDeChen = i;

            // kiểm tra xem số liền trước có lơn hơn giá trị được chèn không
            while (viTriDeChen > 0 && arr[viTriDeChen - 1] > giaTriDeChen) {
                arr[viTriDeChen] = arr[viTriDeChen - 1];
                viTriDeChen--;
                System.out.println("Di chuyen phan tu: " + arr[viTriDeChen]);
            }

            if (viTriDeChen != i) {
                System.out.println(" Chen phan tu: " + giaTriDeChen
                        + ", tai vi tri: " + viTriDeChen);
                // chen phan tu tai vi tri chen
                arr[viTriDeChen] = giaTriDeChen;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5 };

        InsertionSort sapXepChen = new InsertionSort();
        System.out.println("Mang du lieu dau vao: ");
        sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        sapXepChen.display(arr);
    }
}
