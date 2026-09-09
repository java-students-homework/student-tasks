package academy.week01;

/**
 * Week 1 · Lesson 2 — loops: for / while.
 * Write code only inside the methods. Do not change method signatures.
 */
public class LoopTasks {

    /**
     * Sum of numbers from 1 to n inclusive.
     * If n <= 0, return 0.
     * Example: n=4 → 1+2+3+4 = 10.
     */
    public int sumToN(int n) {
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result += i;
        }
        return result;
    }


    /**
     * Factorial of n (n!). 0! = 1, 1! = 1.
     * If n < 0, return -1.
     * Example: n=5 → 120.
     */
    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
        }
        return result;
    }


    /**
     * How many digits the number has. Ignore the minus sign for negatives.
     * Example: 0 → 1, 123 → 3, -45 → 2.
     */
    public int countDigits(int number) {
        number = Math.abs(number);
        int count = 1;
        while (number >= 10) {
            number /= 10;
            count++;

        }


        return count;
    }

    /**
     * Reverse the number. Keep the sign.
     * Example: 123 → 321, -90 → -9, 100 → 1.
     */
    public int reverseNumber(int number) {

    }

    /**
     * Is the number prime: greater than 1 and divisible only by 1 and itself.
     * Example: 2 → true, 9 → false, 1 → false.
     */
    public boolean isPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sum of all even numbers from 1 to n inclusive.
     * If n <= 0, return 0.
     * Example: n=6 → 2+4+6 = 12.
     */
    public int sumEvenToN(int n) {
        int result = 0;
        if (n <= 0) {
            return 0;
        }
        for (int i = 1; i <= 12; i++) {
            result += i;
        }
        return result;
    }


    /**
     * Raise base to the power exponent (exponent >= 0) without Math.pow.
     * Any number to the power of 0 is 1.
     * Example: 2^5 → 32.
     */
    public int power(int base, int exponent) {
int result = 1;
for (int i = 1; i <= exponent; i++) {
    result *= base;
}
return result;
    }

    /**
     * Sum of the digits. Ignore the minus sign for negatives.
     * Example: 123 → 6, -10 → 1.
     */
    public int sumOfDigits(int number) {

        number = Math.abs(number);
        int sum = 0;
        while (number >= 0) {
            sum += number % 10;

            number /= 10;

        }
        return sum;
    }
}
