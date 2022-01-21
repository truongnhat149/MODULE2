package Exercise.java_collection_framework.hash_map_linked_hashmap_tree_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("b", 33);
        hashMap.put("a", 30);
        hashMap.put("c", 40);
        hashMap.put("d ", 25);

        System.out.println("Display in hashmap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display theo thứ tự giảm dần");
        System.out.println(treeMap);

        // tạo linkedHashMap trong main để luwu danh sách và hiển thị dữ liệu

        Map<String, Integer> linkHashMap = new LinkedHashMap<>(16, 6.5f, true);
        linkHashMap.put("Le", 98);
        linkHashMap.put("Phung", 20);
        linkHashMap.put("Cook", 30);
        System.out.println("the age" + linkHashMap.get("Le"));
    }
}
