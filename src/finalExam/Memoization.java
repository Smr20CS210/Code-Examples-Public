package finalExam;

import java.time.Duration;
import java.time.Instant;

public class Memoization {
    private static int numCalls = 0;
    private static int[] memo = new int[51];

    public static void main(String[] args) {
        Instant start = Instant.now();
        
        for (int i = 0; i < 51; i++) {
            memo[i] = -1;
        }
        // 0, 1, 1, 2, 3, 5, 8, ....
        memo[0] = 0;
        memo[1] = 1;

        // TODO: code here
        System.out.println(fib(33));
        System.out.println(numCalls);

        // fib(n) = fib(n-1) + fib(n-2)

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed.toMillis() + " ms");
    }

    public static int fib(int n) {
        // numCalls++;
        if (n < 0) {
            throw new IllegalArgumentException("Cannot pass negative values");
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        numCalls++;
        if (n == 0 || n == 1) {
            return n;
        } else {
            memo[n] = fib(n - 1) + fib(n - 2);
        }
        return memo[n];
    }
}
