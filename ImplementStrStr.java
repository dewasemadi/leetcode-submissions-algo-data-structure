class Solution {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length(), len2 = needle.length();
        if (needle.length() == 0)
            return 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (i + len2 <= len1 && haystack.substring(i, i + len2).equals(needle))
                return i;
        }
        return -1;
    }
}

public class ImplementStrStr {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("hello", "ll"));
    }
}

// problem: https://leetcode.com/problems/implement-strstr/