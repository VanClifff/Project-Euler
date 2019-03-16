package Problems;

/**
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * <p>
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * <p>
 * EN: https://projecteuler.net/problem=1
 * RU: http://euler.jakumo.org/problems/view/1.html
 */

public class Problem_8 {
    public static final String NUMBER = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";

    public static final int NUMBER_LENGTH = NUMBER.length();

    public static final int COUNT_MULTIPLE = 13;

    public static void answer() {
        long maxMultiple = 0;
        long multiple;
        for (int i = 0; i < (NUMBER_LENGTH - COUNT_MULTIPLE + 1); i++) {
            multiple = 1;
            for (int j = 0; j < COUNT_MULTIPLE; j++) {
                if (char2Int(i+j) == 0)
                    break;
                multiple *= char2Int(i + j);
            }
            if (maxMultiple < multiple) {
                maxMultiple = multiple;
            }
        }

        System.out.println("Problem 8: " + maxMultiple);
    }


    public static int char2Int(int index) {

        String charCode = "" + NUMBER.charAt(index);

        int intCharCode;

        switch (charCode) {
            case "0":
                intCharCode = 0;
                break;
            case "2":
                intCharCode = 2;
                break;
            case "3":
                intCharCode = 3;
                break;
            case "4":
                intCharCode = 4;
                break;
            case "5":
                intCharCode = 5;
                break;
            case "6":
                intCharCode = 6;
                break;
            case "7":
                intCharCode = 7;
                break;
            case "8":
                intCharCode = 8;
                break;
            case "9":
                intCharCode = 9;
                break;
            default:
                intCharCode = 1;

        }

        return intCharCode;

    }

}
