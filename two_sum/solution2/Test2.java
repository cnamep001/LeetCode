package com.m.two_sum.solution2;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {

        int [] arr = new int[]{-1, 0, 1, 0, -1};
        Solution2 solution2 = new Solution2();
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = solution2.twoSum(arr,0);

        for (int i = 0; i < result.length ; i++) {
            map.put(result[i],arr[result[i]]);
        }

        System.out.println(map);    // {2=1, 4=-1}

    }
}
