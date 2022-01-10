class Solution {
    public int mySqrt(int x) {
        // find the integer whose square is smaller than x
        int left = 0, right = x;
        int res = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x)
                return mid;
            else if (square < x) {
                res = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return res;
    }
}

public class Sqrt {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395600));
    }
}

/**
 * 
 * Problem: https://leetcode.com/problems/sqrtx/
 * Level: Easy
 * 
 * You are not allowed to use any built-in exponent function or operator, such
 * as pow(x, 0.5) or x ** 0.5.
 * 
 */