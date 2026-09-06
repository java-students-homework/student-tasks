package academy.week03;

import java.util.List;

/**
 * Week 3 · Lesson 4 — Queue / Deque: stack tasks (ArrayDeque).
 */
public class DequeTasks {

    /**
     * Are the brackets balanced? The string contains only ()[]{}.
     * Every opening bracket must be closed by the matching type in the right order.
     * Example: "([]{})" → true, "([)]" → false, "(" → false, "" → true.
     * Hint: push opening brackets on a stack, pop on closing and compare.
     */
    public boolean isBalanced(String brackets) {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Evaluate an expression in Reverse Polish Notation.
     * Tokens are integers or one of: + - * /
     * An operator takes the two TOP values from the stack: first popped = right operand.
     * Division is integer division.
     * Example: ["2", "3", "+"] → 5; ["6", "2", "/"] → 3; ["5", "1", "2", "+", "4", "*", "-"] → -7.
     */
    public int evalRpn(List<String> tokens) {
        throw new UnsupportedOperationException("TODO");
    }
}
