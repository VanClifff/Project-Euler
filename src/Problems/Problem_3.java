package Problems;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * <p>
 * EN: https://projecteuler.net/problem=3
 * RU: http://euler.jakumo.org/problems/view/3.html
 */

public class Problem_3 {
    public static final long NUMBER = 600851475143L;
//    public static final long NUMBER = 13195L;

    public static void answer() {
        long largestFact = 0;
        long[] factors = new long[2];

        for (long i = 2; i * i < NUMBER; i++) {
            if (NUMBER % i == 0) { // It is a divisor
                factors[0] = i;
                factors[1] = NUMBER / i;
                boolean isPrime = true;
                for (int k = 0; k < 2; k++) {
                    isPrime = true;
                    for (long j = 2; j * j < factors[k]; j++) {
                        if (factors[k] % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime && factors[k] > largestFact) {
                        largestFact = factors[k];
                    }
                }
            }
        }
        System.out.println("Problem 3: " + largestFact);
    }

    public static void answer_2() {
        Problem_3 problem = new Problem_3();
        long prime = NUMBER / 2;
        while (!problem.isPrime(prime) & !problem.isDivisor(NUMBER, prime) && prime > 0) {
            prime--;
            System.out.println(prime);
        }

        System.out.println("Problem 3: " + prime);

        if (!problem.isPrime(prime) || !problem.isDivisor(NUMBER, prime)) {
            System.out.println("Problem don't find: " + prime);

        }
        return;

    }

    boolean isPrime(long numb) {
        if (numb % 2 == 0)
            return false;
        for (int i = 3; i < numb / 2; i += 2) {
            if (numb % i == 0)
                return false;
        }

        return true;
    }

    boolean isDivisor(long dividend, long divisor) {
        if (dividend % divisor == 0)
            return true;
        return false;
    }
}
