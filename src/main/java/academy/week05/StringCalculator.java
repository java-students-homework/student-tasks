package academy.week05;

/**
 * Week 5 · Lesson 4 — the classic TDD kata.
 * Do it in the TDD rhythm: write YOUR OWN test first, watch it fail,
 * then write the code, then refactor. Your tests live in your repo;
 * the hidden CI tests check the final behaviour.
 *
 * Rules of add(numbers):
 *  1. ""            → 0
 *  2. "5"           → 5
 *  3. "1,2"         → 3 (any amount of comma-separated numbers)
 *  4. "1\n2,3"      → 6 (newline works as a separator too)
 *  5. negative numbers → IllegalArgumentException
 *     with the message "negatives not allowed: " + the negatives, comma-separated.
 *     Example: "1,-2,-3" → message "negatives not allowed: -2,-3".
 */
public class StringCalculator {

    public int add(String numbers) {
        throw new UnsupportedOperationException("TODO");
    }
}
