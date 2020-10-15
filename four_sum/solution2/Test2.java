package com.m.four_sum.solution2;


import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        int [] arr = new int[]{1, 0, -2, 1, 0, -1};

        Solution2 solution2 = new Solution2();

        List list = solution2.fourSum(arr,0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //  [-2, 0, 1, 1]
            //  [-1, 0, 0, 1]
        }

    }
}
