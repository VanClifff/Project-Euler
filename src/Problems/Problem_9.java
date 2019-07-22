package Problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * EN: https://projecteuler.net/problem=9
 * RU: http://euler.jakumo.org/problems/view/9.html
 */

public class Problem_9 implements IProblem {

    public static final int NUMBER = 1000;

    public String answer() {

//        int sqrtNumber = (int) Math.sqrt(NUMBER);
        for (int i = NUMBER/2 ; i > 1; i--) {
            for (int j = i-1; j > 0; j--) {
                int k = NUMBER - i - j;
                    int temp1 = j * j + k * k;
                    int temp2 = i + j + k;
                    if (i * i == j * j + k * k && i + j + k == 1000) {

                        return String.valueOf(i * j * k);

                }

            }

        }

        return "-";
    }
}

