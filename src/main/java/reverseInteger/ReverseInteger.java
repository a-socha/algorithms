package reverseInteger;

/**
 * Reverse digits of an integer.
 *
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 */
public class ReverseInteger {
    public int reverse(int x) {
        if(x == 0) return 0;
        int multiply = x / Math.abs(x);
        x = Math.abs(x);
        int result = 0;
        while (x > 0) {
            if (overflow(result, x)) return 0;
            result = result * 10 + (x % 10);
            x /= 10;
        }
        return result * multiply;
    }

    private boolean overflow(int result, int x) {
        long test = (long)result * 10 + (long)(x % 10);
        return test > Integer.MAX_VALUE || test < Integer.MIN_VALUE;
    }
}
