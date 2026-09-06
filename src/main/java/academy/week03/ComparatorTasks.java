package academy.week03;

import java.util.List;

/**
 * Week 3 · Lesson 6 — sorting: Comparable and Comparator.
 * Hint: Comparator.comparing, thenComparing, reversed.
 * Do not modify the input lists: return a new sorted list.
 */
public class ComparatorTasks {

    /**
     * Sort numbers in descending order.
     * Example: [3, 1, 2] → [3, 2, 1].
     */
    public List<Integer> sortDescending(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Sort words by length (shorter first); equal length → alphabetically.
     * Example: ["bb", "a", "cc", "b"] → ["a", "b", "bb", "cc"].
     */
    public List<String> sortByLengthThenAlphabet(List<String> words) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Sort people by age (younger first); same age → by name alphabetically.
     * Example: [Bob 30, Ann 25, Kim 30] → [Ann 25, Bob 30, Kim 30].
     */
    public List<Person> sortByAgeThenName(List<Person> people) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The youngest person. If several have the same age, return the first of them.
     * If the list is empty, return null.
     */
    public Person youngest(List<Person> people) {
        throw new UnsupportedOperationException("TODO");
    }
}
