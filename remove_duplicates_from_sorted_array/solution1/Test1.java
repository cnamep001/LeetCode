package com.m.remove_duplicates_from_sorted_array.solution1;



public class Test1 {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 0, 3, 3, 4, 4};

        Solution1 solution1 = new Solution1();

        int length = solution1.removeDuplicates(arr);
        System.out.println("长度是:"+length);

        for (int i = 0; i < length; i++) {
            System.out.println(i+"下标:"+arr[i]);
        }
    }
}
