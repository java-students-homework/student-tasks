package academy.week04;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Week 4 · Lesson 1 — lambdas and functional interfaces.
 * Most methods here RETURN a lambda instead of a value.
 */
public class LambdaTasks {

    /**
     * Return a Predicate that checks: is the string non-empty (length > 0)?
     * Example: predicate.test("a") → true, predicate.test("") → false.
     */
    public Predicate<String> notEmpty() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a Predicate that checks: is the number in [min, max] inclusive?
     */
    public Predicate<Integer> inRange(int min, int max) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a Function that maps a string to its length.
     * Example: function.apply("java") → 4.
     */
    public Function<String, Integer> lengthOf() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Apply the operator to the value twice.
     * Example: op = x -> x * 2, value = 3 → 12.
     */
    public int applyTwice(UnaryOperator<Integer> op, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a Consumer that adds the string it receives into target.
     * Example: consumer.accept("a") → target contains "a".
     */
    public Consumer<String> addTo(List<String> target) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Combine two predicates: the result is true only when BOTH are true.
     * Hint: Predicate has a built-in method for this.
     */
    public Predicate<Integer> both(Predicate<Integer> first, Predicate<Integer> second) {
        throw new UnsupportedOperationException("TODO");
    }
}
