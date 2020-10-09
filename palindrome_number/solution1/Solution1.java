package com.m.palindrome_number.solution1;


public class Solution1 {

    public boolean isPalindrome(Integer x) {
        String string = Integer.toString(x);
        int n = string.length();
        for (int i = 0; i <= n / 2; i++) {
            if (string.charAt(i) != string.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
