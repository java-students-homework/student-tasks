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

        Map<String, Integer> oroginalMap = new HashMap<>();
        oroginalMap.put("One", 1);
        oroginalMap.put("Two", 2);
        oroginalMap.put("Tree", 3);


        Map<Integer , String> invertedMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : oroginalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());

        }
        return invertedMap;
    }

    /**
     * Sum of all values. Empty map → 0.
     * Example: {a=1, b=2} → 3.
     */
    public int sumValues(Map<String, Integer> map) {

        HashMap<String , Integer> Newmap = new HashMap<>();
        map.put("Hebron", 5);
        map.put("Hansen", 1);

        map.put("Hebron" , map.get("Hebron") + map.get("Hansen"));
         return map.get("Hebron");



    }

    /**
     * Merge two maps into a new one. If a key is in both, sum the values.
     * Do not modify the input maps.
     * Example: {a=1, b=2} + {b=3, c=4} → {a=1, b=5, c=4}.
     */
    public Map<String, Integer> mergeSum(Map<String, Integer> a, Map<String, Integer> b) {
        throw new UnsupportedOperationException("TODO");
    }
}
