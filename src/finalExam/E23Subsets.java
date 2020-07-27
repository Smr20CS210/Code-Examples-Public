package finalExam;

import java.util.TreeSet;

public class E23Subsets {
    public static void main(String[] args) {
        TreeSet<Character> chars = new TreeSet<>();
        chars.add('c');
        chars.add('a');
        chars.add('t');
        printSubsets(chars);
    }

    private static void printSubsets(TreeSet<Character> chars) {
        printHelper(chars, new TreeSet<Character>());
    }

    private static void printHelper(TreeSet<Character> chars,
            TreeSet<Character> soFar) {
        // base case
        if (chars.isEmpty()) {
            System.out.println(soFar);
        } else {
            // choose
            char ch = chars.first();
            chars.remove(ch);

            // exclude
            // Don't include this item. Don't add it to soFar
            // Then explore all future possibilities with that item excluded
            printHelper(chars, soFar);

            // Include that item
            soFar.add(ch);
            // Then explore all future possibilities with that item included
            printHelper(chars, soFar);

            // unchoose
            chars.add(ch);
            soFar.remove(ch);
        }
    }

}
