package academy.week01;

/**
 * Week 1 · Lesson 1 — conditions: if / else / else if.
 * Write code only inside the methods. Do not change method signatures.
 */
public class IfElseTasks {

    /**
     * Return the larger of two numbers.
     * Example: a=3, b=7 → 7. If they are equal, return either one.
     */
    public int maxOfTwo(int a, int b) {

        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return a;
        }
    }
        /**
         * Return the largest of three numbers.
         * Example: a=2, b=9, c=4 → 9.
         */
    public int maxOfThree(int a, int b, int c) {

        if (b > a && b > c) {
            return b;
        } else if (a > b && a > c)
            return a;
        else {
            return c;
        }
    }

    /**
     * Return true if the number is even, otherwise false.
     * Example: 4 → true, 7 → false.
     */
    public boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
    /**
     * Return the sign of the number:
     *  1 if number > 0
     * -1 if number < 0
     *  0 if number == 0
     */
    public int sign(int number) {

        if (number > 0) {
            return 1;
        } else if (number < 0)
            return -1;
        else {
            return 0;
        }
    }
    /**
     * Return the absolute value without using Math.abs.
     * Example: -5 → 5, 3 → 3, 0 → 0.
     */
    public int abs(int number) {
        if (number >= 0) {
            return number;
        } else {
            return -number;
        }
    }

    /**
     * Clamp the number to the range [min, max]:
     * if value < min → min
     * if value > max → max
     * otherwise → value
     * Assume min <= max.
     */
    public int clamp(int value, int min, int max) {
        if ( value < min) {
            return min;
        } else if (value >= max) {
            return max;
        } else{
            return value;
        }
    }

    /**
     * Can the person vote: age >= 18.
     * Example: 17 → false, 18 → true.
     */
    public boolean canVote(int age) {
        if ( age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Grade by score:
     * 90–100 → "A"
     * 75–89  → "B"
     * 60–74  → "C"
     * 0–59   → "F"
     * If score < 0 or score > 100, return "INVALID".
     */
    public String grade(int score) {

            if (score < 0 || score > 100 ){
               return "INVALID";
            } else if (score >= 90) {
                return "A";
            } else if (score >= 75) {
                return "B";
            } else if (score >= 60) {
                return "C";
            } else {
                return "F";
            }

    }

    /**
     * Leap year:
     * divisible by 400 → true;
     * else divisible by 100 → false;
     * else divisible by 4 → true;
     * otherwise → false.
     * Example: 2000 → true, 1900 → false, 2024 → true.
     */
    public boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }else
            return false;
    }

    /**
     * FizzBuzz for a single number:
     * divisible by 3 and 5 → "FizzBuzz"
     * only by 3 → "Fizz"
     * only by 5 → "Buzz"
     * otherwise the number as a string (example: 7 → "7").
     */
    public String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }else if (number % 3 == 0) {
            return "Fizz";
        }else if (number % 5 == 0){
             return "Buzz";
        }  else {
            return number + "";
        }
    }
}
