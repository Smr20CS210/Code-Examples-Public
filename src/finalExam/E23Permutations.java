package finalExam;

import java.util.ArrayList;
import java.util.List;

public class E23Permutations {

    public static void main(String[] args) {
        List<Character> chars = new ArrayList<Character>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        chars.add('p');
        printPermutations(chars);
    }

    private static void printPermutations(List<Character> chars) {
        printHelper(chars, "");
    }

    private static void printHelper(List<Character> chars, String soFar) {
        // base case
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            for (int i = 0; i < chars.size(); i++) {
                // choose
                char choice = chars.get(i);
                soFar += choice;
                chars.remove(i);
                // explore
                printHelper(chars, soFar);
                // unchoose
                soFar = soFar.substring(0, soFar.length() - 1);
                chars.add(i, choice);
            }
        }
    }

}
