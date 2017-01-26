package recursion;

/**
 * Created by ll0816 on 1/26/17.
 */

/*
 a to the power of b
 valuate a to the power of b, assuming both a and b are integers and b is non-negative.
 power(2, 0) = 1
 power(2, 3) = 8
 power(0, 10) = 0
 power(-2, 5) = -32
 */
public class power {
    long power(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        long tmp = power(a, b / 2);
        return (b % 2 == 0) ? tmp * tmp : tmp * tmp * a;
    }
}
