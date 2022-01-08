
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (map.containsKey(temp)) {
                /*
                 * i = 0 >> [2, 0] << : temp 7
                 * i = 1 [null, null] : temp >> 2 <<
                 * 
                 * saat i = 1, map sudah mengandung nilai <key, value> [2, 0] dengan temp = 2
                 * 
                 * karena nilai (temp == key) pada map, maka return value dan indeks
                 * iterasi saat ini (i = 1)
                 */
                int result[] = { map.get(temp), i };
                return result;
            }
            map.put(arr[i], i);
        }
        return null;
    }
}

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15, 4, 5 };
        Solution solution = new Solution();

        int ans[] = solution.twoSum(nums, 9);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

/*
 * 
 * Problem: https://leetcode.com/problems/two-sum/
 * Level: Easy
 * 
 * note : exactly one solution
 * input: [2, 7, 11, 15] dan target = 9
 * Output: 0 1
 * 
 * Solusi 1. pake pendekatan naive (brute-force), tapi time complexity jadi
 * O(n^2)
 * Solusi 2. pake struktur data map <key, value>
 * 
 * [arr[i], i]
 * 
 * [2, 0] -> temp = 7
 * [7, 1] -> temp = 2
 * [11, 2] -> temp = -2
 * [15, 3] -> temp = -6
 * 
 */