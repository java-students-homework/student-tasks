package academy.week03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Week 3 · Lesson 1 — List: ArrayList, iteration, contains.
 * Solve with loops and List methods. Streams are next week — not here.
 * Do not modify the input lists: always return a new list.
 */
public class ListTasks {

    /**
     * Return a new list without duplicates, keeping the first occurrence order.
     * Example: [3, 1, 3, 2, 1] → [3, 1, 2].
     */
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> result = new LinkedList<>();
        for (Integer number : numbers) {
            if (!result.contains(number)) {
                result.add(number);
            }
        }
        return result;

    }

    /**
     * Return a new list with all elements of a, then all elements of b.
     * Example: [1, 2], [3] → [1, 2, 3].
     */
    public List<Integer> concat(List<Integer> a, List<Integer> b) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(3);

        a.addAll(b);
        return a;

    }

    /**
     * Return a new list without negative numbers, keeping the order.
     * Example: [1, -2, 3] → [1, 3].
     */
    public List<Integer> withoutNegatives(List<Integer> numbers) {


        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < 0) {

                numbers.remove(i);
            }

        }
        return numbers;
    }

    /**
     * The second largest DISTINCT value.
     * The list always contains at least two distinct values.
     * Example: [5, 1, 5, 3] → 3 (largest is 5, second is 3).
     */
    public int secondLargest(List<Integer> numbers) {
        throw new UnsupportedOperationException("TODO");
    }
}



