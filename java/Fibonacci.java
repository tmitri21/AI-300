/**
 * Fibonacci sequence utilities. F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2).
 */
public final class Fibonacci {

    /** Largest n for which F(n) fits in a signed Java {@code long}. */
    public static final int MAX_LONG_INDEX = 92;

    private Fibonacci() {}

    /**
     * Returns the n-th Fibonacci number F(n) using an iterative O(n) algorithm.
     *
     * @param n index, must be in {@code [0, MAX_LONG_INDEX]} for results to fit in {@code long}
     * @return F(n)
     * @throws IllegalArgumentException if {@code n} is negative or greater than {@link #MAX_LONG_INDEX}
     */
    public static long fibonacci(int n) {
        if (n < 0 || n > MAX_LONG_INDEX) {
            throw new IllegalArgumentException(
                    "n must be between 0 and " + MAX_LONG_INDEX + " inclusive, got: " + n);
        }
        if (n <= 1) {
            return n;
        }
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
