package academy.week03;

/**
 * Week 3 · Lesson 7 — a custom exception.
 * Already implemented, nothing to do here. Thrown from ExceptionTasks.validateAge.
 */
public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException(String message) {
        super(message);
    }
}
