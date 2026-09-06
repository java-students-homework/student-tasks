package academy.week04;

import java.util.List;
import java.util.Optional;

/**
 * Week 4 · Lesson 4 — Optional: how to use it properly.
 * Forbidden: get() without a check and isPresent() + get() chains.
 * Use map, filter, orElse, or, findFirst.
 */
public class OptionalTasks {

    /**
     * The first string starting with prefix.
     * If there is none, return Optional.empty().
     * Example: ["ant", "bee"], "b" → Optional[bee].
     */
    public Optional<String> firstStartingWith(List<String> words, String prefix) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * The value from the Optional, or defaultValue if it is empty.
     * Example: Optional[x], "d" → "x"; Optional.empty(), "d" → "d".
     */
    public String orDefault(Optional<String> value, String defaultValue) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Length of the string inside the Optional (map, no get()).
     * Example: Optional[java] → Optional[4]; empty → empty.
     */
    public Optional<Integer> lengthOf(Optional<String> value) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Keep the value only if it is positive, otherwise empty (filter).
     * Example: Optional[5] → Optional[5]; Optional[-5] → empty.
     */
    public Optional<Integer> positiveOnly(Optional<Integer> value) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return primary if it has a value, otherwise fallback.
     * Hint: Optional.or(...).
     */
    public Optional<String> firstPresent(Optional<String> primary, Optional<String> fallback) {
        throw new UnsupportedOperationException("TODO");
    }
}
