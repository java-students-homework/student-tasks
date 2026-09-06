package academy.week07;

import java.util.Objects;

/**
 * Week 7 — the domain object for OrderDao.
 * Already implemented, nothing to do here.
 * A 3D-print request: what to print and in which status it is.
 */
public final class PrintOrder {

    private final int id;
    private final String item;
    private final String status;

    public PrintOrder(int id, String item, String status) {
        this.id = id;
        this.item = item;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        PrintOrder order = (PrintOrder) other;
        return id == order.id && item.equals(order.item) && status.equals(order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, item, status);
    }

    @Override
    public String toString() {
        return "PrintOrder{" + id + ", " + item + ", " + status + "}";
    }
}
