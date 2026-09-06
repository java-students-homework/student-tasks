package academy.week03;

/**
 * Week 3 · Lesson 7 — exceptions: try-catch, throw, custom exceptions.
 */
public class ExceptionTasks {

    /**
     * Parse the string into an int.
     * If the string is not a number (Integer.parseInt throws
     * NumberFormatException) — return defaultValue.
     * Example: "42" → 42; "abc", default 0 → 0.
     */
    public int parseIntOrDefault(String text, int defaultValue) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Divide a by b.
     * If b == 0, throw IllegalArgumentException with the message "division by zero".
     * Example: 10, 2 → 5.
     */
    public int divide(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Validate the age.
     * If age < 0 or age > 130 — throw InvalidAgeException with any message.
     * Otherwise return the age unchanged.
     */
    public int validateAge(int age) {
        throw new UnsupportedOperationException("TODO");
    }
}
