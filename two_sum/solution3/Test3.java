package com.m.two_sum.solution3;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {

        int [] arr = new int[]{-1, 0, 1, 0, -1};
        Solution3 solution3 = new Solution3();
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = solution3.twoSum(arr,0);

        for (int i = 0; i < result.length ; i++) {
            map.put(result[i],arr[result[i]]);
        }

        System.out.println(map);    // {0=-1, 2=1}

    }
}
