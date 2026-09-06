package academy.week02;

/**
 * Week 2 · Lesson 3 — abstraction + polymorphism.
 * A common shape: every shape has an area and a name, but they are calculated differently.
 * Order inside the lesson: Shape → Circle → Rectangle → ShapeTasks.
 */
public abstract class Shape {

    /**
     * Area of the shape.
     */
    public abstract double area();

    /**
     * Short name of the shape, for example "circle" or "rectangle".
     */
    public abstract String name();
}
