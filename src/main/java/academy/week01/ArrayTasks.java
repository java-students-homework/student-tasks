package academy.week01;

/**
 * Week 1 · Lesson 3 — arrays and loops over arrays.
 * Write code only inside the methods. Do not change method signatures.
 * The array is never empty, except where a method says otherwise.
 */
public class ArrayTasks {

    /**
     * Sum of all elements.
     * If the array is empty, return 0.
     */
    public int sum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    /**
     * Find the maximum element.
     * The array is not empty.
     */
    public int max(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Find the minimum element.
     * The array is not empty.
     */
    public int min(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * How many times value appears in the array.
     * If the array is empty, return 0.
     */
    public int countValue(int[] numbers, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return true if the array contains value.
     */
    public boolean contains(int[] numbers, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Arithmetic mean. If the array is empty, return 0.0.
     * Example: {2, 4} → 3.0.
     */
    public double average(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a new array with elements in reverse order.
     * Do not modify the original array.
     * Example: {1, 2, 3} → {3, 2, 1}.
     */
    public int[] reverse(int[] numbers) {
        throw new UnsupportedOperationException("TODO");
    }
}
