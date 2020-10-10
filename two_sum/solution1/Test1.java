package com.m.two_sum.solution1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {

        int [] arr = new int[]{-1, 0, 1, 2, -1, 4};
        Solution1 solution1 = new Solution1();
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = solution1.twoSum(arr,0);

        for (int i = 0; i < result.length ; i++) {
            map.put(result[i],arr[result[i]]);
        }

        System.out.println(map);    // {0=-1, 2=1}

    }
}
