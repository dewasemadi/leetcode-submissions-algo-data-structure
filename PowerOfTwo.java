class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0)
            return false;

        while (n > 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;
        }
        return n == 1;
    }
}

public class PowerOfTwo {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(1));
    }
}

/**
 * 
 * Problem: https://leetcode.com/problems/power-of-two/
 * Level: Easy
 * 
 * 2^0 = 1
 * 2^1 = 2
 * 2^2 = 4
 * 2^3 = 8
 * ...
 * 
 */