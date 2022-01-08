class Solution {
    public boolean isPalindrome(int num) {
        int original = num, temp, reversed = 0;

        if (num < 0) // buat kasus -121
            return false;

        while (num != 0) {
            temp = num % 10; // ambil digit terakhir 121 -> 1
            reversed = reversed * 10 + temp;
            num /= 10; // buang digit terakhir 121 -> 12
        }
        return reversed == original;
    }
}

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-121));
    }
}

/*
 * Problem: https://leetcode.com/problems/palindrome-number/
 * Level: Easy
 * 
 * 121 -> palindrome
 * -121 -> not palindrome
 * 123 -> not palindrome
 * 
 * Could you solve it without converting the integer to a string?
 * 
 * range nilai -2^(31) <= x <= 2^(31) - 1
 * 
 * solusi paling gampang, reverse number, lalu bandingin ama number awal. kalo
 * sama, return true, selainnya return false. Kelemahannya, kita harus mengolah
 * semua digit angka.
 * 
 * Solusi lain?? kayanya ini bisa pake rekursif, cek n/2 dari jumlah digit
 * angka. Tapi saya mager :D solusi pertama udah acc :p
 * 
 */