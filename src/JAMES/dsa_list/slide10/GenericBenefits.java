package exercise_james.dsa_list.slide10;

import java.util.ArrayList;

public class GenericBenefits {
    // khi không sử dụng GENERIC
    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();
        numbers.add(1);
//        numbers.add("a");
        // sẽ báo lỗi. vì String kh thể add vào integer

        int total = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            total += (int) numbers.get(i);
//            total += numbers.get(i);
        }
        System.out.println("Total :" + total);
    }
}
