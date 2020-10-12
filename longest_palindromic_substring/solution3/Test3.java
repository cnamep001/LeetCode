package com.m.longest_palindromic_substring.solution3;

public class Test3 {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 0, 1, 1, 0, 2};

        Solution3 solution3 = new Solution3();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
        }

        System.out.println(solution3.longestPalindrome(stringBuilder.toString()));   //0110

    }
}
