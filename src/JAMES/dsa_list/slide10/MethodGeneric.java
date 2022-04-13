package exercise_james.dsa_list.slide10;

public class MethodGeneric {
    public static void main(String[] args) {
        Integer[] integers = {1,2,34,6};
        String[] strings = {"Lon Don", "Paris",
                "New York", "Austin"};

        MethodGeneric.<Integer> print(integers);
        MethodGeneric.<String> print(strings);

    }

    private static<E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
        System.out.println();
    }
}
