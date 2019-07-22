package Problems;

import java.util.HashMap;
import java.util.Map;

public class ProblemsBuilder {

    public Map<Integer, IProblem> problems = new HashMap<>();

    public ProblemsBuilder() {
        addAll();
    }

    public void addAll() {
        addProblem(1, new Problem_1());
        addProblem(2, new Problem_2());
        addProblem(3, new Problem_3());
        addProblem(4, new Problem_4());
        addProblem(5, new Problem_5());
        addProblem(6, new Problem_6());
        addProblem(7, new Problem_7());
        addProblem(8, new Problem_8());
        addProblem(9, new Problem_9());
        addProblem(10, new Problem_10());

        addProblem(0, new test());

    }

    public void addProblem(int numberProblem, IProblem problem) {

        problems.put(numberProblem, problem);


    }
}
