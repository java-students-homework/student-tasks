package academy.week04;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Week 4 · Lesson 3 — Stream API: collect, groupingBy, joining, flatMap.
 * Solve this with stream(), not with regular for-loops.
 * Write code only inside the methods. Do not change method signatures.
 */
public class StreamCollectTasks {

    /**
     * Strings STRICTLY longer than minLength, in the same order.
     * Example: ["a", "java", "hi"], minLength=1 → ["java", "hi"];
     * same list, minLength=2 → ["java"] ("hi" has length 2, not longer).
     */
    public List<String> longerThan(List<String> words, int minLength) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * All strings in uppercase, in the same order.
     * Example: ["Java"] → ["JAVA"].
     */
    public List<String> toUpperCase(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Unique words ignoring case. Result values are lowercase.
     * Example: ["Java", "JAVA", "go"] → {"java", "go"}.
     */
    public Set<String> uniqueLowerCase(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Join words with the given separator.
     * Example: ["a", "b", "c"], sep=", " → "a, b, c".
     * Empty list → "".
     */
    public String join(List<String> words, String separator) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Map of word → its length.
     * If a word is repeated, keep either entry — the length is the same.
     * Example: ["hi", "java"] → {hi=2, java=4}.
     */
    public Map<String, Integer> wordLengths(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * How many times each word appears. Case matters.
     * Example: ["a", "b", "a"] → {a=2, b=1}.
     */
    public Map<String, Long> frequency(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Group words by the first letter.
     * The list will not contain empty strings.
     * Example: ["apple", "ant", "bee"] → {a=[apple, ant], b=[bee]}.
     */
    public Map<Character, List<String>> groupByFirstLetter(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Split numbers into even and odd.
     * true — even, false — odd. Keep the order inside each group.
     * Example: [1, 2, 3, 4] → {false=[1, 3], true=[2, 4]}.
     */
    public Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Flatten a list of lists into one list, keeping the order.
     * Example: [[1, 2], [3], []] → [1, 2, 3].
     */
    public List<Integer> flatten(List<List<Integer>> groups) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The longest word. If the list is empty, return "".
     * If several words have the same length, return the first one.
     */
    public String longestWord(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }
}
