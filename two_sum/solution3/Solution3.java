package com.m.two_sum.solution3;


import java.util.HashMap;

public class Solution3 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int anotherNum = target - nums[i];
            if (hashMap.containsKey(anotherNum)) {
                result[0] = hashMap.get(anotherNum);
                result[1] = i;
                return result;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return result;
    }
}
