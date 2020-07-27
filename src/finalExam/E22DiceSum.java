package finalExam;

import java.util.ArrayList;
import java.util.List;

public class E22DiceSum {

    private static int recursiveCalls = 0;

    public static void main(String[] args) {
        diceSum(3, 5);
        System.out.println(recursiveCalls);
    }

    private static void diceSum(int numDie, int desiredSum) {
        diceSumHelper(numDie, desiredSum, new ArrayList<Integer>());
    }

    private static void diceSumHelper(int numDie, int sum,
            List<Integer> chosen) {
        recursiveCalls++;
        // Base case
        if (numDie == 0) {
            if (sum == 0) {
                System.out.print("desired: ");
                System.out.println(chosen);
            }
            System.out.println(chosen);
        }
        // Recursive Case
        else if (numDie * 1 <= sum && sum <= numDie * 6) {
            // For all possible decisions
            for (int i = 1; i <= 6; i++) {
                // Choose
                chosen.add(i);

                // Explore
                diceSumHelper(numDie - 1, sum - i, chosen);

                // Unchoose
                // Try to comment the following line
                // to see what happens
                // Can you understand why?
                chosen.remove(chosen.size() - 1);
            }
        }
    }

}
