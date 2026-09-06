package academy.week04;

import java.util.List;
import java.util.Optional;

/**
 * Week 4 · Lesson 2 — Stream API on numbers.
 * Solve this with stream(), not with regular for-loops.
 * Write code only inside the methods. Do not change method signatures.
 */
public class StreamNumberTasks {

    /**
     * Return only even numbers, in the same order.
     * Example: [1, 2, 3, 4] → [2, 4].
     */
    public List<Integer> evenNumbers(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return the squares of the numbers, in the same order.
     * Example: [2, 3] → [4, 9].
     */
    public List<Integer> squares(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Sum of all numbers. Empty list → 0.
     */
    public int sum(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Product of all numbers. Empty list → 1.
     * Example: [2, 3, 4] → 24.
     */
    public int product(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Maximum. If the list is empty, return Optional.empty().
     */
    public Optional<Integer> max(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * How many numbers are strictly greater than threshold.
     * Example: [1, 5, 7], threshold=4 → 2.
     */
    public long countGreaterThan(List<Integer> numbers, int threshold) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Is there at least one negative number.
     */
    public boolean hasNegative(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Are all numbers positive (> 0). Empty list → true.
     */
    public boolean allPositive(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Unique numbers sorted in ascending order.
     * Example: [3, 1, 3, 2] → [1, 2, 3].
     */
    public List<Integer> uniqueSorted(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The first limit numbers after sorting in descending order.
     * Example: [1, 8, 3, 8], limit=2 → [8, 8].
     * If there are fewer than limit numbers, return all of them.
     */
    public List<Integer> topN(List<Integer> numbers, int limit) {
        throw new UnsupportedOperationException("TODO");
    }
}
