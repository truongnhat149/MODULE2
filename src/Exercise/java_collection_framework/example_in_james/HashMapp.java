package Exercise.java_collection_framework.example_in_james;

import java.util.HashMap;
import java.util.Set;

public class HashMapp {
    public static void main(String[] args) {
        HashMap<String, Integer> customers = new HashMap<>();

        customers.put("Truong", 98);
        customers.put("Hoa", 20);
        customers.put("Voiu", 806);

        Set<String> keys = customers.keySet();
        for (String key : keys) {
            System.out.println("keys" + key + ":" + customers.get(key));
        }
    }
}
