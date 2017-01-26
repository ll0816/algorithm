package dp;

/**
 * Created by ll0816 on 12/11/16.
 */

public class Fibonacci {

    // Time: O(K)
    // Space: O(K)
    long fibonacci(int K) {
        if (K < 0) {
            return 0;
        }
        long[] array = new long[K + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i <= K; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[K];
    }

    // Time: O(K)
    // Space: O(1)
    long fibonacciII(int K) {
        if (K <= 0) {
            return 0;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= K; i++) {
            long tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }
}
