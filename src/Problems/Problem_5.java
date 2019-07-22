package Problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * <p>
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * <p>
 * EN: https://projecteuler.net/problem=5
 * RU: http://euler.jakumo.org/problems/view/5.html
 */

public class Problem_5 implements IProblem {
    public static final int LIMIT = 20;

    public String answer() {

        //общее произведение
        int divisible = 1;


        //перебор всех цифр дл LIMIT
        for (int i = 1; i <= LIMIT; i++) {

            //если текущее делимое делится без остатка на i - то идем дальше
            if (divisible % i == 0) {
                continue;
            }

            //временное число для поиска делителя
            int checkDivisible = divisible;

            //число для дальнейшего поиска делимого
            int checkNumb = i;

            //счетчик вложеного цикла
            int j = checkNumb;

            //поиск НОД, если он не равен 1
            while (j > 1) {

                //если делится без остатка на делитель, то делим исходные числа и проверяем снова
                if (checkNumb % j == 0 && checkDivisible % j == 0) {
                    checkNumb /= j;
                    checkDivisible /= j;
                    j = checkNumb;
                    continue;
                }

                //если без остатка не делится, то уменьшаем счетчик и идем обратно
                j--;
            }

            //умножаем число на НОД
            divisible *= checkNumb;

        }

//        System.out.println("Problem 5: "+divisible);
        return String.valueOf(divisible);
    }

}
