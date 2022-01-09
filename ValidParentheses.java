import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> dict = new HashMap<>();

        dict.put('(', ')');
        dict.put('{', '}');
        dict.put('[', ']');

        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);

            if (temp == '(' || temp == '{' || temp == '[')
                stack.push(temp);
            else if (stack.size() > 0 && dict.get(stack.peek()) == temp) // stack.peek = stack.top
                stack.pop();
            else
                return false;
        }
        return stack.size() == 0;
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()[]{}"));
        System.out.println(solution.isValid("{{[()]}}"));
        System.out.println(solution.isValid("}}"));
    }
}

/*
 * 
 * Problem: https://leetcode.com/problems/valid-parentheses/
 * Level: Easy
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * (, ), [, ], {, }
 * 
 * () -> valid
 * ()[]{} -> valid
 * (] -> invalid
 * 
 * pake struktur data stack buat nampung karakter (, {, sama [
 * struktur data map buat dictionary (pair key : value dari setiap bracket)
 * jika saat iterasi ketemu karakter ), }, atau ] tinggal cek dictionary dengan
 * dict.get(stack.top) == temp
 * 
 * dict.get(stack.top) akan mereturn value dari stack.top, misal:
 * stack.top = [
 * maka, dict.get('[') = ']'
 * 
 */