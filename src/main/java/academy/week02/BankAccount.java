package academy.week02;

/**
 * Week 2 · Lesson 1 — encapsulation.
 * Keep the balance in a private field only. Outside code may use the methods below.
 */
public class BankAccount {

    /**
     * Create an account with the given initialBalance.
     * If initialBalance < 0, set the balance to 0.
     */
    public BankAccount(int initialBalance) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Return the current balance.
     */
    public int getBalance() {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Add amount to the balance.
     * If amount <= 0, do nothing.
     */
    public void deposit(int amount) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Withdraw amount. If there is enough money and amount > 0, withdraw and return true.
     * Otherwise leave the balance unchanged and return false.
     */
    public boolean withdraw(int amount) {
        throw new UnsupportedOperationException("TODO");
    }
}
