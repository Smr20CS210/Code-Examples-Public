package finalExam;

import java.util.ArrayList;
import java.util.List;

public class E22DiceRoll {
    public static void main(String[] args) {
        diceRoll(2);
    }

    private static void diceRoll(int numDie) {
        diceRollHelper(numDie, new ArrayList<Integer>());
    }

    private static void diceRollHelper(int numDie, List<Integer> chosen) {
        // Base case
        if (numDie == 0) {
            System.out.println(chosen);
        }
        // Recursive Case
        else {
            // For all possible decisions
            for (int i = 1; i <= 6; i++) {
                // Choose
                chosen.add(i);

                // Explore
                diceRollHelper(numDie - 1, chosen);

                // Unchoose
                // Try to comment the following line
                // to see what happens
                // Can you understand why?
                chosen.remove(chosen.size() - 1);
            }
        }
    }
}
