package Problems;

import java.util.Iterator;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * <p>
 * EN: https://projecteuler.net/problem=4
 * RU: http://euler.jakumo.org/problems/view/4.html
 */

public class Problem_4 {

    public static final int MAX_NUMBER = 999;

    public static void answer() {
        //будем хранить максимальный полиндром
        int maxPoly = 1;



        //произведение чисел
        int multiply;

        //перебор всех значений с конца
        for (int i = MAX_NUMBER; i > 0; i--) {
            for (int j = MAX_NUMBER; j > 0; j--) {
                //произведение чисел
                multiply = i * j;

                //проверка на полиндром и что новый палиндром больше предыдущего.
                if (isPoly(multiply) && multiply > maxPoly) {
                    //переопределяем максимальный палиндром
                    maxPoly = multiply;
                    continue;
                }

            }

        }

        System.out.println("Problem 4: " + maxPoly);

    }

    public static boolean isPoly(int multiply) {


        //переводим в строку
        String multiplyString = Integer.toString(multiply);

        //проверяем на полиндром
        for (int k = 0; k <= multiplyString.length() - 1; k++) {
            for (int l = multiplyString.length() - 1, m = 0; l >= 0; m++, l--) {

                //возврат, если цифры не сходятся
                if (k == m && multiplyString.charAt(k) != multiplyString.charAt(l))
                    return false;

            }
        }

        return true;
    }


}
