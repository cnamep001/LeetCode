package com.m.four_sum.solution3;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        int [] arr = new int[]{1, 0, -2, 1, 0, -1};

        Solution3 solution3 = new Solution3();

        List list = solution3.fourSum(arr,0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //  [-2, 0, 1, 1]
            //  [-1, 0, 0, 1]
        }

    }
}
