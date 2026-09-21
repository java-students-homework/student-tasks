package academy.week01;

public class LoopTasks {

    public int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public int countDigits(int number) {
        number = Math.abs(number);
        int count = 1;
        while (number >= 10) {
            number /= 10;
            count++;
        }
        return count;
    }

    public int reverseNumber(int number) {
        int result = 0;
        int rest = Math.abs(number);
        while (rest > 0) {
            result = result * 10 + rest % 10;
            rest /= 10;
        }
        return number < 0 ? -result : result;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumEvenToN(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    public int sumOfDigits(int number) {
        int rest = Math.abs(number);
        int sum = 0;
        while (rest > 0) {
            sum += rest % 10;
            rest /= 10;
        }
        return sum;
    }
}
