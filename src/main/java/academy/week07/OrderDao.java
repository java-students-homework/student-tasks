package academy.week07;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Week 7 — JDBC: PreparedStatement, ResultSet, the DAO pattern.
 *
 * The table already exists (the tests create it):
 *   orders: id INT PRIMARY KEY | item VARCHAR | status VARCHAR
 *
 * Rules:
 *  - ONLY PreparedStatement with ? parameters. String concatenation of SQL
 *    is an SQL injection — such solutions are rejected on review.
 *  - Close resources with try-with-resources.
 *  - Declare throws SQLException, do not swallow exceptions.
 */
public class OrderDao {

    private final Connection connection;

    public OrderDao(Connection connection) {
        this.connection = connection;
    }

    /**
     * Lesson 1 — INSERT via PreparedStatement.
     * Save the order into the table (all three columns).
     */
    public void insert(PrintOrder order) throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 2 — SELECT one row.
     * Find an order by id. If there is none, return null.
     */
    public PrintOrder findById(int id) throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 2 — SELECT many rows.
     * All orders sorted by id.
     */
    public List<PrintOrder> findAll() throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 3 — UPDATE.
     * Change the status of the order with the given id.
     * Return true if a row was updated, false if there is no such id
     * (hint: executeUpdate returns the number of affected rows).
     */
    public boolean updateStatus(int id, String newStatus) throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 3 — DELETE.
     * Delete the order by id. Return true if a row was deleted.
     */
    public boolean deleteById(int id) throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Lesson 4 — SELECT with a condition + aggregation.
     * How many orders have the given status.
     */
    public int countByStatus(String status) throws SQLException {
        throw new UnsupportedOperationException("TODO");
    }
}
