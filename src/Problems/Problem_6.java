package Problems;

/**
 * The sum of the squares of the first ten natural numbers is,
 * <p>
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 * <p>
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * <p>
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * EN: https://projecteuler.net/problem=6
 * RU: http://euler.jakumo.org/problems/view/6.html
 */

public class Problem_6 {

    public static final int LIMIT = 100;

    public static void answer() {

        System.out.println("Problem 6: " + (getSqrSum() - getSumSqr()));
    }

    //The sum of the squares
    private static int getSumSqr() {
        int sumSqr = 0;

        for (int i = 0; i <= LIMIT; i++) {
            sumSqr += i * i;
        }
        return sumSqr;
    }

    //The square of the sum
    private static int getSqrSum() {
        int sqrSum = (LIMIT + 1) * LIMIT / 2;
        return sqrSum * sqrSum;

    }
}
