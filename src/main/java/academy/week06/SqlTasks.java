package academy.week06;

/**
 * Week 6 — SQL. Each method returns ONE SQL query as a string.
 * The hidden tests run your SQL against a real database with this schema:
 *
 *   users:  id INT PK | name VARCHAR | city VARCHAR
 *   orders: id INT PK | user_id INT FK→users.id | item VARCHAR | price INT | status VARCHAR
 *
 * Test data (do not rely on it in the SQL itself — write general queries):
 *   users:  (1, Ann, Kyiv), (2, Bob, Lviv), (3, Kate, Kyiv), (4, Dan, Odesa)
 *   orders: (1, user 1, phone case, 120, DONE)
 *           (2, user 1, gear,        90, NEW)
 *           (3, user 2, bracket,    200, DONE)
 *           (4, user 3, toy,         50, CANCELLED)
 *           (5, user 3, stand,      150, NEW)
 *
 * Return plain SQL, e.g.: return "SELECT name FROM users ORDER BY name";
 * Column order and ORDER BY matter — follow the task text exactly.
 */
public class SqlTasks {

    /**
     * Lesson 1 — SELECT + ORDER BY.
     * Names of all users, sorted alphabetically. One column: name.
     */
    public String allUserNames() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 1 — WHERE.
     * Names of users from the city 'Kyiv', sorted alphabetically. One column: name.
     */
    public String userNamesFromKyiv() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 1 — WHERE with a number.
     * Ids of orders with price greater than 100, sorted by id. One column: id.
     */
    public String expensiveOrderIds() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 2 — aggregation.
     * Total number of orders. One row, one column.
     */
    public String countOrders() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 3 — INNER JOIN.
     * For every order with status 'DONE': the item and the user's name.
     * Two columns in this order: item, name. Sorted by item.
     */
    public String doneOrdersWithUserNames() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 3 — JOIN + GROUP BY.
     * For every user who HAS orders: user's name and the total price of their orders.
     * Two columns in this order: name, total price. Sorted by name.
     */
    public String totalPricePerUser() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 4 — GROUP BY.
     * How many orders are in each status.
     * Two columns in this order: status, count. Sorted by status.
     */
    public String statusCounts() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 4 — GROUP BY + HAVING.
     * Cities that have at least 2 users. One column: city. Sorted by city.
     */
    public String citiesWithAtLeastTwoUsers() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 5 — subquery.
     * Ids of orders with price above the average price of all orders.
     * One column: id. Sorted by id.
     */
    public String ordersAboveAveragePrice() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 5 — LEFT JOIN (or NOT IN).
     * Names of users who have NO orders. One column: name. Sorted by name.
     */
    public String usersWithoutOrders() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 6 — INSERT.
     * Insert a new user: id 5, name 'Eve', city 'Lviv'.
     */
    public String insertUser() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 6 — UPDATE.
     * Raise the price of ALL orders with status 'NEW' by 10.
     */
    public String raiseNewOrderPrices() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 6 — DELETE.
     * Delete all orders with status 'CANCELLED'.
     */
    public String deleteCancelledOrders() {
        throw new UnsupportedOperationException("TODO");
    }
}
