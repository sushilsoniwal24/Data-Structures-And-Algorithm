package Hashing.Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        /* Insert :- Put */
        map.put("Sushil", 19);
        map.put("Doraemon", 16);
        map.put("Hattori", 18);
        map.put("Robotan", 10);
        map.put("Doraemon", 17);

        System.out.println(map);

        /* Searching :- containsKey. */
        if (map.containsKey("Sushil")) {
            System.out.println("Sushil Is Present In The Map");
        } else {
            System.out.println("Sushil Is Not Present In The Map");
        }

        /* Get Corresponding Value. */
        System.out.println(map.get("Robotan"));
        System.out.println(map.get("ShinChan"));

        /* Remove. */
        map.remove("Hattori");
        System.out.println(map);

        /* Iteration. */
        for (Map.Entry<String, Integer> it : map.entrySet()) {
            System.out.print(it.getKey() + "->" + " ");
            System.out.println(it.getValue());
        }
    }
}
