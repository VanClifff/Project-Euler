package Problems;

public class Problem_7 implements IProblem{

    public static final int PRIME_NUMBER = 10001;
    public String answer() {

        Problem_10 problem10 = new Problem_10();
        problem10.setLIMIT(200000);
        problem10.answer();
        int primeNumber = problem10.numbersPull.get(PRIME_NUMBER-1);
        return String.valueOf(primeNumber);
    }
}
