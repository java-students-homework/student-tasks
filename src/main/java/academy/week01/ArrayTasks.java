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

        for ( int i = 0; i < numbers.length; i ++) {
             sum += numbers[i];

        }

        return sum;
    }

    /**
     * Find the maximum element.
     * The array is not empty.
     */
    public int max(int[] numbers) {

        int max = 0;
        for ( int i = 1; i < numbers.length; i ++) {
            if ( numbers[i] > max) {
                max = numbers [i];


            }
        }
        return max;

    }

    /**
     * Find the minimum element.
     * The array is not empty.
     */
    public int min(int[] numbers) {

        int min = numbers[0];
        for ( int i = 0; i < numbers.length; i --) {
            if ( numbers [i] < min ) {
                min = numbers [i];

            }
        }
        return min;


    }

    /**
     * How many times value appears in the array.
     * If the array is empty, return 0.
     */
    public int countValue(int[] numbers, int value) {

        int res = 0;

        for ( int i = 0; i < numbers.length; i ++) {
            if ( numbers[i] == value) {
                res ++;

            }

        }
        return res;

    }

    /**
     * Return true if the array contains value.
     */
    public boolean contains(int[] numbers, int value) {

        for ( int i =0; i < numbers.length; i ++) {
            if ( value == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Arithmetic mean. If the array is empty, return 0.0.
     * Example: {2, 4} → 3.0.
     */
    public double average(int[] numbers) {

        int sum = 0;

        for ( int i = 0; i < numbers.length; i ++) {
            sum += numbers[i];
        }
        return sum / numbers.length;

    }

    /**
     * Return a new array with elements in reverse order.
     * Do not modify the original array.
     * Example: {1, 2, 3} → {3, 2, 1}.
     */
    public int[] reverse(int[] numbers) {

        int [] arr = new int [ numbers.length];
        int j = 0;

        for ( int i = numbers.length - 1; i >= 0; i -- ) {
            arr[j] = numbers[i];

            j++;

        }
        return arr;
    }
}
