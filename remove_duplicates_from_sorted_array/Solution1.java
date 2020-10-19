package com.m.remove_duplicates_from_sorted_array;


public class Solution1 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[index] = nums[i];
            index++;
        }
        return index;
    }
}
