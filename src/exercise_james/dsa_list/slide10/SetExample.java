package exercise_james.dsa_list.slide10;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        set.add("Beijing");


        System.out.println(set);

        for (String s: set)
        {
            System.out.println(s.toUpperCase());
        }
    }
}
