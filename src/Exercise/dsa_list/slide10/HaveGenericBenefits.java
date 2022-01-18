package Exercise.dsa_list.slide10;

import java.util.ArrayList;

public class HaveGenericBenefits {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
//        numbers.add("a");

        int total = 0;
        for (int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
        }
        System.out.println("Total " + total);
    }
}

