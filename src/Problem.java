import Problems.*;

import java.util.Map;


public class Problem {
    static Map<Integer, IProblem> problems;


    public Problem() {
        ProblemsBuilder problemsBuilder = new ProblemsBuilder();
        this.problems = problemsBuilder.problems;
    }


    public void showAnswer(int numberProblem) {
        if (problems.containsKey(numberProblem)) {
            System.out.println("Problem "+numberProblem+": "+ this.problems.getOrDefault(numberProblem, null).answer());
        }
    }

    public void showAll() {
        for (Map.Entry<Integer, IProblem> problem : problems.entrySet()) {

//            problem.getValue().answer();
showAnswer(problem.getKey());

        }

    }


}
