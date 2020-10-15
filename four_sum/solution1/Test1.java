package com.m.four_sum.solution1;


import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        int [] arr = new int[]{1, 0, -1, 1, 0, -1};

        Solution1 solution1 = new Solution1();

        List list = solution1.fourSum(arr,0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            //  [-1, -1, 1, 1]
            //  [-1, 0, 0, 1]
        }

    }
}
