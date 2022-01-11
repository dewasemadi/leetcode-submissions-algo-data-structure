class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}

public class AddDigits {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(38));
    }
}

/**
 * Problem: https://leetcode.com/problems/add-digits/
 * Level: Easy
 * 
 * Could you do it without any loop/recursion in O(1) runtime?
 * 
 * 
 */