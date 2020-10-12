package com.m.longest_palindromic_substring.solution1;


public class Test1 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 0, 1, 1, 0, 2};

        Solution1 solution1 = new Solution1();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution1.longestPalindrome(stringBuilder.toString()));   //0110

    }
}
