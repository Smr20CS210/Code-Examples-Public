package midterm1;

import java.util.Stack;

public class E04PrintReverse {

    public static void main(String[] args) {
        String str = "Hello! my name is Charlie Chaplin!";

        String[] words = str.split(" ");

        Stack<String> stack = new Stack<String>();

        for (String word : words) {
            stack.push(word);
        }

        System.out.println(stack);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

}
