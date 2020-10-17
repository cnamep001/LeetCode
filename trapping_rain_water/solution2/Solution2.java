package com.m.trapping_rain_water.solution2;

public class Solution2 {

    public int trap(int[] height) {
        int n = height.length;
        int result = 0;
        if (n == 0 || n == 1) {
            return result;
        }
        int left = 0;
        while (left < n - 1 && height[left + 1] >= height[left]) {
            left++;
        }
        int right = n - 1;
        while (right >= 1 && height[right - 1] >= height[right]) {
            right--;
        }
        while (left < right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            if (leftHeight <= rightHeight) {
                while (left < right) {
                    left++;
                    if (height[left] < leftHeight) {
                        result += leftHeight - height[left];
                    } else {
                        break;
                    }
                }
            } else {
                while (left < right) {
                    right--;
                    if (height[right] < rightHeight) {
                        result += rightHeight - height[right];
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }

}