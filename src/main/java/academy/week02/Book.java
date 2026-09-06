package academy.week02;

/**
 * Week 2 · Lesson 5 — equals and hashCode.
 * Two books are equal if they have the same isbn. title does not affect equality.
 */
public class Book {

    /**
     * Store isbn and title in fields.
     */
    public Book(String isbn, String title) {
        throw new UnsupportedOperationException("TODO");
    }

    public String getIsbn() {
        throw new UnsupportedOperationException("TODO");
    }

    public String getTitle() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Equal if other is also a Book and the isbn matches.
     * Check for null and for the same class.
     */
    @Override
    public boolean equals(Object other) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * If equals is true, hashCode must be the same.
     * Compute hashCode from isbn only.
     */
    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("TODO");
    }
}
