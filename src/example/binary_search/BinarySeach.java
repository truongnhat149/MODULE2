package example.binary_search;

public class BinarySeach {
    public static void main(String[] args) {
        int[] numbers = {4,5,6,35,4,7,8,1,12,53};
        int value = 5;
        System.out.println(binarySearch(numbers, value));
    }

    public static int binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (value < numbers[mid])
                high = mid - 1;
            else if (value == numbers[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }
}
