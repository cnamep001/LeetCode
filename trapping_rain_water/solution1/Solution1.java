package com.m.trapping_rain_water.solution1;


import java.util.Stack;

public class Solution1 {

    public int trap(int[] height) {
        int n = height.length;
        int result = 0;
        if (n == 0 || n == 1) {
            return result;
        }
        int cur = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while (cur < n) {
            while (!stack.isEmpty() && height[cur] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int distance = cur - stack.peek() - 1;
                int tempHeight = Math.min(height[cur], height[stack.peek()]) - height[top];
                result += tempHeight * distance;
            }
            stack.push(cur);
            cur++;
        }
        return result;
    }

}
