public class Solution {
    public int climbStairs(int n) {
        return fib(n + 1);
    }

    private int fib(int n) {
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;
        
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n - 1];
    }
}
