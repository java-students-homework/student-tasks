package academy.week04;

/**
 * Week 4 · Lesson 5 — records.
 * A record already has a constructor, x()/y() accessors, equals, hashCode
 * and toString. You only add the methods below.
 */
public record Point(int x, int y) {

    /**
     * Distance to another point:
     * sqrt((x2-x1)^2 + (y2-y1)^2). Hint: Math.sqrt.
     * Example: (0,0) → (3,4) = 5.0.
     */
    public double distanceTo(Point other) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return a NEW point shifted by dx and dy.
     * Records are immutable — you cannot change this one.
     * Example: (1,2).translate(3, -1) → (4,1).
     */
    public Point translate(int dx, int dy) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Is the point at the origin (0,0)?
     */
    public boolean isOrigin() {
        throw new UnsupportedOperationException("TODO");
    }
}
