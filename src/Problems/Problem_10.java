package Problems;

import java.util.*;

public class Problem_10 implements IProblem {

        public int LIMIT = 2000000;
        public static final int MIN_PRIME = 2;
        public int MAX_SEARCH = (int) Math.sqrt(LIMIT);

        List<Integer> numbersPull = new ArrayList<>(LIMIT);

        public void setLIMIT(int LIMIT) {
            this.LIMIT = LIMIT;
        }

        public String answer() {


            for (int i = MIN_PRIME; i < LIMIT; i++) {
                numbersPull.add(i);
            }

            removeNumbers(0);

            long sum = 0;
            int numbersPullSize = numbersPull.size();
            for (int i = 0; i < numbersPullSize; i++) {
                sum += numbersPull.get(i);
            }

            return String.valueOf(sum);

//        return "142913828922 (фейк)";
        }

        public void removeNumbers(int index) {
            int divider = numbersPull.get(index);
            ListIterator<Integer> numberIter = numbersPull.listIterator(index);
            while (numberIter.hasNext()) {


                Integer number = numberIter.next();

                if (number != divider && number % divider == 0) {
                    numberIter.remove();

                }


            }
            if (index < numbersPull.size() - 1 && divider < MAX_SEARCH) {
                removeNumbers(index + 1);
            }
    }
}
