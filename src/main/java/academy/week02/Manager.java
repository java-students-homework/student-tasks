package academy.week02;

/**
 * Week 2 · Lesson 2 — inheritance (part 2).
 * A manager is an employee with a bonus.
 * pay() = salary + bonus.
 * Take name and salary from the parent via super(...).
 */
public class Manager extends Employee {

    /**
     * Pass name and salary to the Employee constructor,
     * store bonus in your own field.
     */
    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int pay() {
        throw new UnsupportedOperationException("TODO");
    }
}
