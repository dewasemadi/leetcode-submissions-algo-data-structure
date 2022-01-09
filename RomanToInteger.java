import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int romanToInt(String str) {
        int num = 0;
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (i == str.length() - 1) // skip karakter diujung kanan
                cnt = 0;
            char nextTemp = str.charAt(i + cnt);

            // langsung cek 2 karakter (special case), kalo match naikin counter
            if (temp == 'I' && nextTemp == 'V') {
                num += 4;
                i++;
            } else if (temp == 'I' && nextTemp == 'X') {
                num += 9;
                i++;
            } else if (temp == 'X' && nextTemp == 'L') {
                num += 40;
                i++;
            } else if (temp == 'X' && nextTemp == 'C') {
                num += 90;
                i++;
            } else if (temp == 'C' && nextTemp == 'D') {
                num += 400;
                i++;
            } else if (temp == 'C' && nextTemp == 'M') {
                num += 900;
                i++;
            } else
                num += dict.get(temp); // kasus biasa
        }
        return num;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}

/*
 * Problem: https://leetcode.com/problems/roman-to-integer/
 * Level: Easy
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * IV = 4
 * IX = 9
 * 
 * XL = 40
 * XC = 90
 * 
 * CD = 400
 * CM = 900
 * 
 * Untuk kasus spesial, langsung cek 2 karakter, selainnya jumlahin kek biasa..
 * cheers
 * 
 */
