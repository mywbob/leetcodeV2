class Solution {
    /*
    * Brute force method
    * Time: O(2^n) - Size of recursion tree
    * Space: O(n) - The depth of the recursion tree can go upto n
    */
    /*
    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
    */
    
    /*
    * Recursion with memorization
    * Time: O(n) - Size of recursion tree can go upto n.
    * Space: O(n) - The depth of recursion tree can go upto n.
    */
    /*
    public int climbStairs(int n) {
        int[] cache = new int[n+1];
        return climbStairsHelper(n, cache);
    }
    
    private int climbStairsHelper(int n, int[] cache) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (cache[n] == 0) {
             cache[n] = climbStairsHelper(n-1, cache) + climbStairsHelper(n-2, cache);
        } 
        return cache[n];
    }
    */
    
    /*
    * DP method:
    * Core of DP: 
    * 1)problem can be broken into subproblems
    * 2)it contains the optimal substructure property(i.e. its optimal solution can be constructed efficiently from optimal  solutions of its subproblems)
    * Time: O(n)
    * Space: O(n)
    */
    /*
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        } else {
            int[] dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i<=n; i++) {
                dp[i] = dp[i-1] + dp[i-2];
            }
            return dp[n];
        }
    }
    */
    
    /*
    * Fibonacci Number:
    * Time: O(n)
    * Space: O(1)
    */
    public int climbStairs(int n) {
        if (n <=2) return n;
        int first = 1;
        int second = 2;
        int third = 0;
        for (int i=3; i<=n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}