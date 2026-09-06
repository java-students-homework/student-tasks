package academy.week02;

import java.util.List;

/**
 * Week 2 · Lesson 4 (part 4) — polymorphism through an interface.
 * Do not check the concrete discount class: work with Discount.
 */
public class DiscountTasks {

    /**
     * Apply all discounts in order: each next discount is applied to the already reduced price.
     * Example: price 100, first -10%, then -20 money → 90, then 70.
     */
    public int applyAll(int price, List<Discount> discounts) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * From all discounts, pick the one that gives the lowest price.
     * Apply only that one discount once. If the list is empty, return the original price.
     */
    public int applyBest(int price, List<Discount> discounts) {
        throw new UnsupportedOperationException("TODO");
    }
}
