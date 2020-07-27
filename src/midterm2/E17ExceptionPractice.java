/*
 * There's a call-stack diagram at the bottom of the file
 */

package midterm2;

public class E17ExceptionPractice {
    public static void main(String[] args) {
        topFunction();
    }

    public static void topFunction() {
        middleFunction();
    }

    public static void middleFunction() {
        lastFunction(-2);
        try {
            lastFunction(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // lastFunction(-6);
    }

    public static void lastFunction(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }

        // try {
        // int x = 6 / 1;
        // Scanner y = null;
        // y.hasNext();
        // } catch (ArithmeticException | NullPointerException e) {
        // System.out.println(e.getMessage());
        // }
    }
}

/*
 * This is what the call-stack looks like when the exception occurs.
 * Each function gets its own space on the stack to store whatever
 * variables or object references it needs to store.
 * 
 * |-------------------|
 * |                   |
 * |       main        |
 * |                   |
 * |-------------------|
 * |                   |
 * |    topFunction    |
 * |                   |
 * |-------------------|
 * |                   |
 * |   middleFunction  |
 * |                   |
 * |-------------------|
 * |                   |
 * |   lastFunction    |
 * |                   |
 * |-------------------|
 */
