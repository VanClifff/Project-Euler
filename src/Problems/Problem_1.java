package Problems;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * <p>
 * EN: https://projecteuler.net/problem=1
 * RU: http://euler.jakumo.org/problems/view/1.html
 */

public class Problem_1 {


    public static final int LIMIT = 1000;

    public static void answer() {

        int sum = 0;
        for (int i = 3; i < LIMIT; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;

        }
        System.out.println("Problem 1: " + sum);
    }
}
