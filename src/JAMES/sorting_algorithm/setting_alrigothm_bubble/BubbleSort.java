package exercise_james.sorting_algorithm.setting_alrigothm_bubble;

public class BubbleSort {
    // ở sắp xếp nổi bọt,  nếu mảng đã được sắp xếp theo thứ tự tăng dần
    //  để tránh việc sắp xếp lại, ta có 1 biến needNextPass để hạn chế việc tráo
    // đổi thứ tự
    static int[] list = {1, 4, 2, 19, 82, 45, 6, 7, 8, -12, 56, 24};


    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        int leng = list.length;
        for (int i = 1; i < leng && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < leng - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }
}
