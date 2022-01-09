class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1])
                nums[k++] = nums[i];
        }
        return k;
    }
}

public class RemoveDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };
        Solution solution = new Solution();

        System.out.println(solution.removeDuplicates(arr));
    }
}

/*
 * Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Level: Easy
 * 
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * 
 * sebenernya ada solusi yang lebih simpel dari diatas, tinggal pake struktur
 * data set -> set ga boleh ada duplicate value/number :p
 * tapi compiler leetcode bilang wrong answer, emg disuru tanpa pake set
 * sepertinya :D
 * 
 */