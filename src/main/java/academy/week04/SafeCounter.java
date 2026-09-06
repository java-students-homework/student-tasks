package academy.week04;

/**
 * Week 4 · Lesson 8 — threads: race condition and synchronized.
 * Several threads will call increment() at the same time.
 * A plain counter++ loses updates (race condition) — the test will catch it.
 * Make increment() safe. Hint: the synchronized keyword.
 */
public class SafeCounter {

    /**
     * Increase the counter by 1. Must be thread-safe.
     */
    public void increment() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Current value of the counter.
     */
    public int value() {
        throw new UnsupportedOperationException("TODO");
    }
}
