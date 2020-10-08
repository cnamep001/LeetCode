package com.m.lc_threenum.solution2;

public class Test2 {
    public static void main(String[] args) {
        int [] arr = new int[]{-1, 0, 1, 2, -1, 4};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.threeSum(arr));    //  [[-1, -1, 2], [-1, 0, 1]]
    }
}
