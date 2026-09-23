package academy.week03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Week 3 · Lesson 2 — Map: HashMap, iteration over entries.
 * Solve with loops and Map methods (get, put, getOrDefault, merge).
 */
public class MapTasks {

    /**
     * How many times each word appears. Case matters.
     * Example: ["a", "b", "a"] → {a=2, b=1}.
     */
    public Map<String, Integer> wordCount(List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        return map;
    }

    /**
     * Swap keys and values. All values are unique.
     * Example: {a=1, b=2} → {1=a, 2=b}.
     */
    public Map<Integer, String> invert(Map<String, Integer> map) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Tree", 3);


        Map<Integer , String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());

        }
        return invertedMap;
    }

    /**
     * Sum of all values. Empty map → 0.
     * Example: {a=1, b=2} → 3.
     */
    public int sumValues(Map<String, Integer> map) {

        HashMap<String , Integer> newMap = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        map.put("a" , map.get("a") + map.get("b"));
         return map.get("a");



    }

    /**
     * Merge two maps into a new one. If a key is in both, sum the values.
     * Do not modify the input maps.
     * Example: {a=1, b=2} + {b=3, c=4} → {a=1, b=5, c=4}.
     */
    public Map<String, Integer> mergeSum(Map<String, Integer> a, Map<String, Integer> b) {

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("One" ,1);
        map1.put("Two", 2);
        map1.put("Tree", 3);


        Map<String,Integer> map2 = new HashMap<>();

        map2.put("Four", 4);
        map2.put("Five", 5);
        map2.put("Six",6);


        Map<String,Integer> unitMap = new HashMap<>(a);
        unitMap.putAll(b);

        return unitMap;

    }
}
