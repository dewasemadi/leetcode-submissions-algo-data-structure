class Solution {
    public int lengthOfLastWord(String str) {
        String[] arrOfStr = str.split(" ");
        return arrOfStr[arrOfStr.length - 1].length();
    }
}

public class LengthOfLastWord {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  "));
    }
}

/**
 * Problem: https://leetcode.com/problems/length-of-last-word/
 * Level: Easy
 * 
 * Input: Hello World
 * Output: 5
 * 
 * split string jadi array of string, trus return idx terakhir
 */