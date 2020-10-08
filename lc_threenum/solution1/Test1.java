package com.m.lc_threenum.solution1;


import com.m.lc_threenum.solution1.Solution1;

public class Test1 {
    public static void main(String[] args) {

        int [] arr = new int[]{-1, 0, 1, 2, -1, 4};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.threeSum(arr));    //  [[-1, -1, 2], [-1, 0, 1]]

    }
}
