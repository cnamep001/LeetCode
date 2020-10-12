package com.m.longest_palindromic_substring.solution2;


public class Test2 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 0, 1, 1, 0, 2};

        Solution2 solution2 = new Solution2();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution2.longestPalindrome(stringBuilder.toString()));   //0110

    }
}
