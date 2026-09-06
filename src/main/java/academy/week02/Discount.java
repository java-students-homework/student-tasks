package academy.week02;

/**
 * Week 2 · Lesson 4 — interfaces.
 * A discount does one thing: turn a price into a discounted price.
 * Order inside the lesson: Discount → PercentDiscount → FixedDiscount → DiscountTasks.
 */
public interface Discount {

    /**
     * Return the price after the discount. The result must not be less than 0.
     */
    int apply(int price);
}
