package academy.week03;

/**
 * Week 3 · Lesson 5 — generics.
 * A pair of two values of any types. A and B are type parameters:
 * Pair&lt;String, Integer&gt; holds a String and an Integer.
 */
public class Pair<A, B> {

    /**
     * Store first and second in fields of types A and B.
     */
    public Pair(A first, B second) {
        throw new UnsupportedOperationException("TODO");
    }

    public A getFirst() {
        throw new UnsupportedOperationException("TODO");
    }

    public B getSecond() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a NEW pair with the elements swapped.
     * Pair("age", 30).swapped() → Pair(30, "age").
     */
    public Pair<B, A> swapped() {
        throw new UnsupportedOperationException("TODO");
    }
}
