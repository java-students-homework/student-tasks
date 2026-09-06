package academy.week02;

/**
 * Week 2 · Lesson 6 — enum.
 * A traffic light with three states. The order of switching:
 * RED → GREEN → YELLOW → RED → ...
 */
public enum TrafficLight {

    RED, YELLOW, GREEN;

    /**
     * Return the next state of the traffic light.
     * RED → GREEN, GREEN → YELLOW, YELLOW → RED.
     * Hint: switch works nicely with enums.
     */
    public TrafficLight next() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * May a car drive on this light? Only GREEN → true.
     */
    public boolean canDrive() {
        throw new UnsupportedOperationException("TODO");
    }
}
